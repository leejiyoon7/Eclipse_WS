package sec01.exam02;

public class ThreadNameExample {
	public static void main(String[] args) {
		//���� �������� ��ü ���� ���
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		//threadA
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		//threadB
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
	}
}
