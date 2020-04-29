package sec01.exam11;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1 - 예외를 발생시켜 while()문 종료
		/* try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);//일시정지
			}	
		} catch(InterruptedException e) {}
		*/
		
		//how2
		while(true) {
			System.out.println("실행 중");
			//interrupt 상태값이 true 이면 while문 종료
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

