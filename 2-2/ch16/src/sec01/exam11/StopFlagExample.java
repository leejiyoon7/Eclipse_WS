package sec01.exam11;

public class StopFlagExample {
	public static void main(String[] args)  {
		//printThread ����
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		//1�� �Ŀ� stop �÷����� ���� ����(printThread ����)
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		printThread.setStop(true);
	}
}

