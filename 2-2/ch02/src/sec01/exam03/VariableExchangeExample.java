package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		//변수 선언
		int x = 3;
		int y = 5;
		//출력
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}

