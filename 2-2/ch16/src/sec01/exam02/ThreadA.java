package sec01.exam02;

public class ThreadA extends Thread {	
	//생성자
	public ThreadA() {
		setName("ThreadA");//스레드 이름 설정
	}
	@Override
	public void run() {		
		for(int i=0; i<2; i++) {		
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}

