package sec01.exam15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Runnable�� �۾�(run()�޼���)�� ����� ���� ��ü�� �����ϱ�
public class ResultByRunnableExample {
	public static void main(String[] args) {
		//������ Ǯ ����(�ִ� ������ ��)
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[�۾� ó�� ��û]");
		//�۾��� Task ��ü�� ����(�ܺ� ���� ��ü)
		class Task implements Runnable {
			//�ܺ� ���� ��ü�� ������ ������ �ʵ� ����
			Result result;
			
			/* Task Ŭ������ ������
			   - Task ��ü ������ �ܺ� ���� ��ü�� ������ �Ű������� �޾� �ʵ忡 ����
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
				result.addValue(sum);//���� ��ü�� ��� ���� ����
			}
		}
		
		//�ܺ� ���� ��ü ����(�ΰ��� task ��ü�� ����)
		Result result = new Result();
		
		//�� ���� �۾� ����
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		/* ������ Ǯ�� �۾� ť�� ����(submit()�� Future ��ü�� ����)
		   - submit(�۾� ��ä, ������ü)
		   - Future ��ü�� ���� ��ü�μ� �۾� �Ϸ� �� get()�޼���� ���� ����
		 */
		Future<Result> future1 = executorService.submit(task1, result);
		
		try {
			Thread.sleep(2000);//2�ʵ��� �Ͻ� ����
		} catch (InterruptedException e1) {	e1.printStackTrace();}
		
		Future<Result> future2 = executorService.submit(task2, result);
		
		try {
			result = future1.get();//task1 ��ü�� ���� ������� result�� ����
			System.out.println("[ó�� ���] " + result.accumValue);		
			
			result = future2.get();//task2 ��ü�� ���� ������� result�� ����
			System.out.println("[ó�� ���] " + result.accumValue);
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[���� ���� �߻���] " + e.getMessage());
		}
		//������ Ǯ ����
		executorService.shutdown();
	}
}

//Result ���� ��ü Ŭ���� ����(���� �����尡 ������ ��ü)
class Result { 
	int accumValue;//�� �������� ó�� ��� ���� ������ �ʵ�
	
	//accumValue �ʵ忡 ���� ������ addValue() �޼��带 ����ȭ �޼���� ����
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
