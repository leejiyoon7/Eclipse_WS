package sec01.exam09;

public class WaitNotifyExample {
	public static void main(String[] args) {
		//���� ��ü ����
		WorkObject sharedObject = new WorkObject();
		
		//ThreadA, ThreadB ����(������ü)
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
