package sec03.exam04;

public class DoubleOperationExample {
	public static void main(String[] args) {
		//피연산자 중 크기가  큰 타입으로 자동 타입 변환
		
		int intValue = 10;
		double doubleValue = 5.5;
		
		double result = intValue + doubleValue;	
		System.out.println("result : " + result);	
		
		//int로 강제 캐스팅
		int result2 = intValue + (int) doubleValue;	
		System.out.println("result2 : " + result2);	
	}
}

