package sec01.exam01;

public class VariableIntializationExample {
	public static void main(String[] args) {
		//변수 선언
		//int value;
		int value = 10;
		
		/* 변수 value값을 읽고 10을 더하여 변수 result에 저장하는 산술연산
		   - value 변수의 값이 초기화되지 않아 컴파일 오류
		 */
		int result = value + 10;
		
		//연산결과를 콘솔에 출력
		System.out.println(result);
	}
}
