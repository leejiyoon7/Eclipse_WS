package sec01.exam04;

public class MainThreadExample {
	public static void main(String[] args) {
		//calculator  ��ü ����
		Calculator calculator = new Calculator();
		
		// user1 ������ ����
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		//user2 ������ ����
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
