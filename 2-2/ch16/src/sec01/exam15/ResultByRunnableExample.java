package sec01.exam15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Runnable의 작업(run()메서드)의 결과를 공유 객체에 저장하기
public class ResultByRunnableExample {
	public static void main(String[] args) {
		//스레드 풀 생성(최대 스레드 수)
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		//작업을 Task 객체로 생성(외부 공유 객체)
		class Task implements Runnable {
			//외부 공유 객체의 참조를 저장할 필드 선언
			Result result;
			
			/* Task 클래스의 생성자
			   - Task 객체 생성시 외부 공유 객체의 참조를 매개변수로 받아 필드에 저장
			 */
			Task(Result result) { 
				this.result = result;
			}
			
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				result.addValue(sum);//공유 객체에 결과 값을 누적
			}
		}
		
		//외부 공유 객체 생성(두개의 task 객체가 공유)
		Result result = new Result();
		
		//두 개의 작업 생성
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		/* 스레드 풀의 작업 큐에 저장(submit()은 Future 객체를 리턴)
		   - submit(작업 객채, 공유객체)
		   - Future 객체는 지연 객체로서 작업 완료 후 get()메서드로 값을 얻음
		 */
		Future<Result> future1 = executorService.submit(task1, result);
		
		try {
			Thread.sleep(2000);//2초동안 일시 정지
		} catch (InterruptedException e1) {	e1.printStackTrace();}
		
		Future<Result> future2 = executorService.submit(task2, result);
		
		try {
			result = future1.get();//task1 객체의 실행 결과값을 result에 저장
			System.out.println("[처리 결과] " + result.accumValue);		
			
			result = future2.get();//task2 객체의 실행 결과값을 result에 저장
			System.out.println("[처리 결과] " + result.accumValue);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		//스레드 풀 종료
		executorService.shutdown();
	}
}

//Result 공유 객체 클래스 선언(여러 스레드가 공유할 객체)
class Result { 
	int accumValue;//각 스레드의 처리 결과 값을 누적할 필드
	
	//accumValue 필드에 값을 누적할 addValue() 메서드를 동기화 메서드로 선언
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
