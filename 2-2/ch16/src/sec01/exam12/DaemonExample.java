package sec01.exam12;

public class DaemonExample {
	public static void main(String[] args) {
		//스레드 생성
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		//main 스레드의 데몬 스레드 설정
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			//5초 후에 main 스레드가 종료돰-데몬 스레드도 함꼐 종료됨
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}
}
