package sec01.exam11;

public class PrintThread1 extends Thread {
	//stop 플래그 선언
	private boolean stop;
	
	public void setStop(boolean stop) {
	  this.stop = stop;
	}
	
	public void run() {	
		while(!stop) {
			System.out.println("실행 중");
		}	
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

