package sec01.exam09;

//������ü Ŭ����
public class WorkObject {
	//����ȭ �޼���
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();//���� waiting �� �ٸ� �����带 ���� ��� ���·� ��ȯ
		try {
			wait();//�ڱ� �ڽ��� �Ͻ������� ��ȯ
		} catch (InterruptedException e) {}
	}
	//����ȭ �޼���
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
