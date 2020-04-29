package sec01.exam06;

//EmptyStringException 선언
public class EmptyStringException extends Exception {
	//생성자
	public EmptyStringException() {
		//부모 생성자를 호출하여 예외발생시 출력할 메시지 전달
		super("빈 문자열입니다.");
	}
}
