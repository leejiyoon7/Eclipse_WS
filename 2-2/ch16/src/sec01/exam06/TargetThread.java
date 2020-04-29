package sec01.exam06;

public class TargetThread extends Thread {	
	public void run() {
		for(long i=0; i<2000000000; i++) {}
		
		try {
			//1.5초간 일시 정지(TIMED_WAITING)
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(long i=0; i<2000000000; i++) {}
	}
}
