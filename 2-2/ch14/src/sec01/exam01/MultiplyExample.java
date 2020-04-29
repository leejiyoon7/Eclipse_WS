package sec01.exam01;

public class MultiplyExample {
	public static void main(String[] args) {
		//인터페이스 Multiply 타입을 참조하는 변수선언(타겟 타입)
		Multiply m;
		
		//Multiply 인터페이스를 구현하는 람다식
		m = () -> {return 3.14159 * 2 * 2;};
		System.out.println("Area: " + m.getVlaue());
		 
		m = () -> 3.14159 * 4;
		System.out.println("Circumference: " + m.getVlaue());
	}	
}
