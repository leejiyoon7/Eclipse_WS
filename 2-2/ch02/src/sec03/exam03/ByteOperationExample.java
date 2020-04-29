package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		/* 컴파일 단계에서의 정수 연산- 컴파일러가 연산 수행
		 * - 정수 리터럴을 연산하는 경우, 컴파일러는 컴파일 단계에서 정수 리터럴을
		 *   연산 결과를 저장할 변수 타입으로 변환하여 연산을 수행하고, 
		 *   그 결과를 result1 변수에 저장
		 */
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		/* 리터럴이 변수에 저장된 경우에는 JVM에서 연산 수행
		 * 연산시 JVM은 피연산자 변수 x, y의 타입을  int로 자동 타입 변환후  연산 수행
		 */
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}
}

