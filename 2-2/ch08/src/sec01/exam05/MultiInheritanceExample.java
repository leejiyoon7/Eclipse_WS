package sec01.exam05;

//구현 클래스를 이용하는 실행 클래스 작성
public class MultiInheritanceExample {
	public static void main(String[] args) {
		//구현 객체 생성
		ImplementationC imp = new ImplementationC();
		
		//InterfaceA 타입 변수에 구현 객체 대입
		InterfaceA ia = imp;
		ia.methodA();//methodA만 호출 가능
		System.out.println();
		
		//InterfaceB 타입 변수에 구현 객체 대입
		InterfaceB ib = imp;
		ib.methodB();//methodB만 호출 가능
		System.out.println();
		
		//InterfaceC 타입 변수에 구현 객체 대입
		InterfaceC ic = imp;
		ic.methodA();//모두 호출 가능
		ic.methodB();
		ic.methodC();
		System.out.println();
	}
}
