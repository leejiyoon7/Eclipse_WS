package sec01.exam11;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1 - ���ܸ� �߻����� while()�� ����
		/* try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);//�Ͻ�����
			}	
		} catch(InterruptedException e) {}
		*/
		
		//how2
		while(true) {
			System.out.println("���� ��");
			//interrupt ���°��� true �̸� while�� ����
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

