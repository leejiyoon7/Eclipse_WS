package sec01.exam07;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();//실행을 양보하고 실행 대기상태
			}
		}
		System.out.println("ThreadB 종료");
	}
}

