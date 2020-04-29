package sec01.exam15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//작업처리 완료 후 리턴(결과)값이 있는작업의 완료 통보를 blocking 방식으로 하기
public class ResultByCallableExample {
	public static void main(String[] args) {
		//스레드 풀 생성(최대 스레드 수)
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		//작업을 Callable 객체로 생성(결과 값이 있는 작업, 리턴 타입: Integer)
		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				return sum;//작업 결과 리턴
			}
		};
		
		/* 스레드 풀의 작업 큐에 저장(submit()은 Future 객체를 리턴)
		   - Future 객체는 지연 객체로서 작업 완료 후 get()메서드로 값을 얻음
		 */
		Future<Integer> future = executorService.submit(task);
		
		try {
			/* 스레드가 작업을 완료할 때까지 기다렸다가 값을 얻음
			   - get()메서드는 작업이 완료(run()메서드 실행 완료)될 때까지만 blocking 되었다가  
			           작업이 완료되면 작업 결과 값을 받아 sum에 저장
			 */
			int sum = future.get();
			System.out.println("[처리 결과 리턴값] " + sum);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}
