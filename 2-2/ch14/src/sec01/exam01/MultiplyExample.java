package sec01.exam01;

public class MultiplyExample {
	public static void main(String[] args) {
		//�������̽� Multiply Ÿ���� �����ϴ� ��������(Ÿ�� Ÿ��)
		Multiply m;
		
		//Multiply �������̽��� �����ϴ� ���ٽ�
		m = () -> {return 3.14159 * 2 * 2;};
		System.out.println("Area: " + m.getVlaue());
		 
		m = () -> 3.14159 * 4;
		System.out.println("Circumference: " + m.getVlaue());
	}	
}
