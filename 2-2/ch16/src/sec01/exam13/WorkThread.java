package sec01.exam13;

public class WorkThread extends Thread {
	//생성자(스레드 그룹과 스레드명 지정)
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		//상위 그룹의 생성자를 호출하여 스레드 그룹과 스레드명 지정
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}
