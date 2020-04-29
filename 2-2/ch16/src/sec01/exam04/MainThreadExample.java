package sec01.exam04;

public class MainThreadExample {
	public static void main(String[] args) {
		//calculator  按眉 积己
		Calculator calculator = new Calculator();
		
		// user1 胶饭靛 积己
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		//user2 胶饭靛 积己
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
