package sec01.exam04;

public class User1 extends Thread {	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");//스레드 이름 설정
		this.calculator = calculator;//calculator 객체 할당
	}
	
	public void run() {
		//calculator 객체의 memory 필드에 100 할당
		calculator.setMemory(100);
	}
}

