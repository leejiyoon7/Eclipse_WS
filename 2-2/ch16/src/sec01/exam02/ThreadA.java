package sec01.exam02;

public class ThreadA extends Thread {	
	//������
	public ThreadA() {
		setName("ThreadA");//������ �̸� ����
	}
	@Override
	public void run() {		
		for(int i=0; i<2; i++) {		
			System.out.println(getName() + "�� ����� ����");
		}
	}
}

