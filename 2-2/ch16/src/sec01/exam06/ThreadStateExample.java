package sec01.exam06;

public class ThreadStateExample {
	public static void main(String[] args) {
		//statePrintThread ����
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
