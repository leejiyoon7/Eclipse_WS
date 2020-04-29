package sec01.exam05;

//구현 클래스 선언
public class ImplementationC implements InterfaceC {
	//구현 클래스에서는 모든 추상메소드를 재정의해야 함
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}	
}
