package sec02.exam06;

/* 사용자 정의 잔고부족 예외 클래스 선언
   - 예외 종류에 따라 일반 예외(Exception) 또는 실행 예외(RuntimeException)를 상속 
 */
public class BalanceInsufficientException extends Exception {

	//기본 생성자
	public BalanceInsufficientException() { }
	//예외 발생 메시지를 포함하는 예외 객체를 만들기 위한 생성자
	public BalanceInsufficientException(String message) {
		/* super(message)를 사용하여 예외 메시지를 설정
		   - 예외 발생 메시지를 상위 클래스 생성자를 호출하여 설정
		 */
		super(message);	
	}	
}
