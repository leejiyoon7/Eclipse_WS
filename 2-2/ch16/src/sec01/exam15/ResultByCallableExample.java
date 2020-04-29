package sec01.exam15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//�۾�ó�� �Ϸ� �� ����(���)���� �ִ��۾��� �Ϸ� �뺸�� blocking ������� �ϱ�
public class ResultByCallableExample {
	public static void main(String[] args) {
		//������ Ǯ ����(�ִ� ������ ��)
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[�۾� ó�� ��û]");
		//�۾��� Callable ��ü�� ����(��� ���� �ִ� �۾�, ���� Ÿ��: Integer)
		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				return sum;//�۾� ��� ����
			}
		};
		
		/* ������ Ǯ�� �۾� ť�� ����(submit()�� Future ��ü�� ����)
		   - Future ��ü�� ���� ��ü�μ� �۾� �Ϸ� �� get()�޼���� ���� ����
		 */
		Future<Integer> future = executorService.submit(task);
		
		try {
			/* �����尡 �۾��� �Ϸ��� ������ ��ٷȴٰ� ���� ����
			   - get()�޼���� �۾��� �Ϸ�(run()�޼��� ���� �Ϸ�)�� �������� blocking �Ǿ��ٰ�  
			           �۾��� �Ϸ�Ǹ� �۾� ��� ���� �޾� sum�� ����
			 */
			int sum = future.get();
			System.out.println("[ó�� ��� ���ϰ�] " + sum);
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			System.out.println("[���� ���� �߻���] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}
