package sec02.exam03;

//AutoCloseable 인터페이스를 구현한 AutoCloseObj 클래스 선언
public class AutoCloseObj2 implements AutoCloseable{

	//AutoCloseable 인터페이스의 close() 오버라이딩
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}
}
