package sec02.exam03;

public class AutoCloseExample {
	public static void main(String[] args) {
		//사용할 리소스 객체 생성
		AutoCloseObj obj = new AutoCloseObj();
		try (obj){//자바 9부터 외부에 선언된 리소스 변수 사용가능
			//강제로 예외 발생
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 부분 입니다");
		}
	}
}
