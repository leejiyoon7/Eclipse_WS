package sec01.exam09;

public class ThreadA extends Thread {
	//공유객체를 필드로 선언
	private WorkObject workObject;

	//생성자(공유객체를 매개변수로 받아 필드에 저장)
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			//workObject.methodA() 호출
			workObject.methodA();
		}
	}
}

