package sec01.exam07;

public class ThreadA extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();//������ �纸�ϰ� ���� ������
			}
		}
		System.out.println("ThreadA ����");
	}
}

