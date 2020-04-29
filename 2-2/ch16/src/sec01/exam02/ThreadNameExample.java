package sec01.exam02;

public class ThreadNameExample {
	public static void main(String[] args) {
		//현재 스레드의 객체 참조 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		//threadA
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		//threadB
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
