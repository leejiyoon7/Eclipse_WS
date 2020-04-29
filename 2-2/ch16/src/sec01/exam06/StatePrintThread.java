package sec01.exam06;

//targetThread�� ���¸� ����ϱ� ���� ������
public class StatePrintThread extends Thread {	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			//targetThread�� ���� ���
			Thread.State state = targetThread.getState();
			System.out.println("targetThread ����: " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

