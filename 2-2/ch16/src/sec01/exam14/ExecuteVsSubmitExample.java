package sec01.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		//������ Ǯ ����(�ִ� ������ ��)
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		//10���� �۾��� �۾�ť�� ����
		for(int i=0; i<10; i++) {
			//�۾� ����(Runnable ��ü)
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//������ �� �������
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();//������ Ǯ�� �ִ� �� ������ �� 
					
					//�۾�ó�� ������ ��������
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
					//���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};
			
			//�۾� ť�� �۾�ó�� ��û
			executorService.execute(runnable);//���ܰ� �߻��ϸ� �����尡 ����ǰ�, �ش� ������� Ǯ���� ���ŵ�(�����)
			//executorService.submit(runnable);//���ܰ� �߻��ص� �����尡 ������� �ʰ�, ���� �۾��� ���� ������ ����
			
			Thread.sleep(10);
		}
		
		//������ Ǯ ����
		executorService.shutdown();
	}
}
