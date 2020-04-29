package sec02.exam04;

public class ThrowsExceptionExample {
	public static void main(String[] args) {
		//예외처리를 안하면 오류 발생
		//findClass();
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	//findClass() 메서드에서 발생할 예외(ClassNotFoundException)를 호출한 것으로 떠넘기기
	public static void findClass() throws ClassNotFoundException {
		Class c1 = Class.forName("java.lang.String");//ClassNotFoundException 발생
	}
}
