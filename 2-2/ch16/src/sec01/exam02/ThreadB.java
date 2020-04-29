package sec01.exam02;

public class ThreadB extends Thread {	
	@Override
	public void run() {		
		for(int i=0; i<2; i++) {		
			//스레드 이름 출력
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}

