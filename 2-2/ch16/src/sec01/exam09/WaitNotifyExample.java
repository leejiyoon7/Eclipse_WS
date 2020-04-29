package sec01.exam09;

public class WaitNotifyExample {
	public static void main(String[] args) {
		//傍蜡 按眉 积己
		WorkObject sharedObject = new WorkObject();
		
		//ThreadA, ThreadB 积己(傍蜡按眉)
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		threadA.start();
		threadB.start();
	}
}
