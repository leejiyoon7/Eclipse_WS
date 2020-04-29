package sec01.exam11;

public class StopFlagExample {
	public static void main(String[] args)  {
		//printThread 생성
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		//1초 후에 stop 플래그의 값을 변경(printThread 종료)
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		printThread.setStop(true);
	}
}

