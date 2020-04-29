package sec01.exam09;

//공유객체 클래스
public class WorkObject {
	//동기화 메서드
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();//현재 waiting 된 다른 스레드를 실행 대기 상태로 전환
		try {
			wait();//자기 자신을 일시정지로 전환
		} catch (InterruptedException e) {}
	}
	//동기화 메서드
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
