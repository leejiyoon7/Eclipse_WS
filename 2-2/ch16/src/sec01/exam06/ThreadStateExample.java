package sec01.exam06;

public class ThreadStateExample {
	public static void main(String[] args) {
		//statePrintThread »ý¼º
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
