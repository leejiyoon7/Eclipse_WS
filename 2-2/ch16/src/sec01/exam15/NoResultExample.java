package sec01.exam15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//�۾�ó�� �Ϸ� �� ����(���) ���� ���� �۾��� �Ϸ� �뺸�� blocking ������� �ϱ�
public class NoResultExample {
	public static void main(String[] args) {
		//������ Ǯ ����(�ִ� ������ ��)
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()//���� ��ǻ�� cpu�� core ��
		);
		
		System.out.println("[�۾� ó�� ��û]");
		//�۾��� Runnable ��ü�� ����(��� ���� ���� �۾�)
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("[ó�� ��� ���] " + sum);//��¸� ��(���� ���� ����)
			}
		};
		
		/* ������ Ǯ�� �۾� ť�� ����(submit()�� Future ��ü�� ����)
		   - Future ��ü�� ���� ��ü�μ� �۾� �Ϸ� �� get()�޼���� ���� ����
		 */
		Future future = executorService.submit(runnable);
		
		try {
			/* �����尡 �۾��� �Ϸ��� ������ ��ٷȴٰ� ���� ����
			   - get()�޼���� �۾��� �Ϸ�(run()�޼��� ���� �Ϸ�)�� �������� blocking �Ǿ��ٰ�  
			           �۾��� �Ϸ�Ǹ� �۾� ��� ���� ���� ������ null ����
			 */
			future.get();
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch(Exception e) {
			System.out.println("[���� ���� �߻���] " + e.getMessage());
		}
		
		//������ Ǯ ����
		executorService.shutdown();
	}
}
