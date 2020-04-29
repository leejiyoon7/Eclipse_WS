package sec01.exam11;

public class InterruptExample {
	public static void main(String[] args)  {
		//스레드 생성
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		/* interrupt()호출하면 thread가 일시정지일 때 
		      예외가 발생하여 while()문 종료  */
		thread.interrupt();
	}
}
