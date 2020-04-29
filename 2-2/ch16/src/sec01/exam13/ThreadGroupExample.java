package sec01.exam13;

public class ThreadGroupExample {
	public static void main(String[] args) {
		//스레드 그룹 생성(main그룹-myGroup)
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//스레드 생성(myGroup에 workThreadA 생성) 
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		//스레드 생성(myGroup에 workThreadB 생성)
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		//현재(main) 스레드의 그룹 얻어오기 
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();		
		mainGroup.list();//mainGroup(main그릅) 그룹의 정보 출력 
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();//myGroup 소속된 모든 스레드를 종료하도록 그룹에서 interrupt() 호출
	}
}
