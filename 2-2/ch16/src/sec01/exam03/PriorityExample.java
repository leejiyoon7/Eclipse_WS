package sec01.exam03;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//스레드 생성
			Thread thread = new CalcThread("thread" + i);
			
			//우선순위 설정
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}

