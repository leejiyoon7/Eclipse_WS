package sec01.exam09;

public class ThreadA extends Thread {
	//������ü�� �ʵ�� ����
	private WorkObject workObject;

	//������(������ü�� �Ű������� �޾� �ʵ忡 ����)
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			//workObject.methodA() ȣ��
			workObject.methodA();
		}
	}
}

