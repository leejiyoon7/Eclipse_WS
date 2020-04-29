package sec01.exam01.interfaces;

public class MyInterfaceExample {
	
	//MyInterface 타입으로 매개변수 선언
	public static void printMethod(MyInterface mi) {
		mi.print();
	}
	
	//MyInterface 타입으로 반환값 선언
	public static MyInterface printMethod2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("printMethod2 메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}
		
	public static void main(String[] args) {
		//구현-1(일반)
		MyInterfaceImp myInterface1 = new MyInterfaceImp();
		myInterface1.print();
		
		System.out.println("=============");
		
		printMethod(myInterface1);
		
		System.out.println("=============");
		
		//구현-2(익명 클래스 사용)
		MyInterface myInterface2 = new MyInterface() {			
			@Override
			public void print() {
				System.out.println("MyInterface를 익명 클래스로 구현");				
			}
		};
		myInterface2.print();
		
		System.out.println("=============");
		
		printMethod(myInterface2);
		
		System.out.println("=============");
		
		//구현-3(익명 클래스 사용 - 선언, 생성, 호출을 한번에 처리 )
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("MyInterface를 익명 클래스로 구현(선언, 생성, 호출을 한번에 처리)");
			}
		}).print(); // 선언, 생성, 호출을 한번에 처리
		
		System.out.println("=============");
		
		//MyInterface를 반환하는 메서드를 호출
		MyInterface mi2 = printMethod2();
		mi2.print(); // printMethod2() 메서드에서 반환된 MyInterface
	}
}

