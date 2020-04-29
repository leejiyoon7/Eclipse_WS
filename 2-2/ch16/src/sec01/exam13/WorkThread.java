package sec01.exam13;

public class WorkThread extends Thread {
	//������(������ �׷�� ������� ����)
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		//���� �׷��� �����ڸ� ȣ���Ͽ� ������ �׷�� ������� ����
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " �����");
	}
}
