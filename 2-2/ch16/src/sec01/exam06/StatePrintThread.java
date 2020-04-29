package sec01.exam06;

//targetThread의 상태를 출력하기 위한 스레드
public class StatePrintThread extends Thread {	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			//targetThread의 상태 출력
			Thread.State state = targetThread.getState();
			System.out.println("targetThread 상태: " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5초간 일시 정지
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

