package sec01.exam07;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();//������ �纸�ϰ� ���� ������
			}
		}
		System.out.println("ThreadB ����");
	}
}

