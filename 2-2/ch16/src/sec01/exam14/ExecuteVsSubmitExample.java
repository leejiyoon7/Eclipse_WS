package sec01.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		//스레드 풀 생성(최대 스레드 수)
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		//10개의 작업을 작업큐에 저장
		for(int i=0; i<10; i++) {
			//작업 정의(Runnable 객체)
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//스레드 총 개수얻기
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();//스레드 풀에 있는 총 스레드 수 
					
					//작업처리 스레드 가져오기
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
					//예외 발생 시킴
					int value = Integer.parseInt("삼");
				}
			};
			
			//작업 큐에 작업처리 요청
			executorService.execute(runnable);//예외가 발생하면 스레드가 종료되고, 해당 스레드는 풀에서 제거됨(재생성)
			//executorService.submit(runnable);//예외가 발생해도 스레드가 종료되지 않고, 다음 작업을 위해 스레드 재사용
			
			Thread.sleep(10);
		}
		
		//스레드 풀 종료
		executorService.shutdown();
	}
}
