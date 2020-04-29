package sec01.exam07;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();	
		threadA.start();		
		threadB.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false;//threadA 실행 대기 상태로 변경 - threadB 실행
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = true;//threadA와 threadB가 번갈아 실행
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;//threadA 종료
		threadB.stop = true;//threadB 종료
	}
}
