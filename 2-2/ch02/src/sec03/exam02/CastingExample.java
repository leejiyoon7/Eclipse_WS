package sec03.exam02;

public class CastingExample {
	public static void main(String[] args) {	
		int intValue = 44032;
		
		//강제 타입 변환(Casting)
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	
		
		intValue = 10;
		doubleValue = 5.5;
		//double result = intValue + doubleValue;
		int result = intValue + (int)doubleValue;
		System.out.println(result);
		
	} 
}

