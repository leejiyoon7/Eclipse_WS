package sec01.exam11;

public class PrintThread1 extends Thread {
	//stop �÷��� ����
	private boolean stop;
	
	public void setStop(boolean stop) {
	  this.stop = stop;
	}
	
	public void run() {	
		while(!stop) {
			System.out.println("���� ��");
		}	
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

