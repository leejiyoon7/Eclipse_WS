package sec01.exam06;

public class TargetThread extends Thread {	
	public void run() {
		for(long i=0; i<2000000000; i++) {}
		
		try {
			//1.5�ʰ� �Ͻ� ����(TIMED_WAITING)
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(long i=0; i<2000000000; i++) {}
	}
}
