package sec01.exam08;

public class JoinExample {
	public static void main(String[] args) {
		//sumThread todtjd
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		//System.out.println("1~100 합: " + sumThread.getSum());
		
		try {
			sumThread.join();//sumThread의 실행이 완료될 떄까지 main 스레드 일시정지
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

