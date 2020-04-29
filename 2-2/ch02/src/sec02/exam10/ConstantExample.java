package sec02.exam10;

public class ConstantExample {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM = 60;
		
		System.out.println("MAX_NUM:" + MAX_NUM);
		System.out.println("MIN_NUM:" + MIN_NUM);
		
		//MIN_NUM = 50;//The final local variable MIN_NUM cannot be assigned
	}
}
