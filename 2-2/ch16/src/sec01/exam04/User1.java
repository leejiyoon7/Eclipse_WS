package sec01.exam04;

public class User1 extends Thread {	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");//������ �̸� ����
		this.calculator = calculator;//calculator ��ü �Ҵ�
	}
	
	public void run() {
		//calculator ��ü�� memory �ʵ忡 100 �Ҵ�
		calculator.setMemory(100);
	}
}

