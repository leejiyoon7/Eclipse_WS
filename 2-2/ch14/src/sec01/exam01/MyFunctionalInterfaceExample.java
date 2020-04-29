package sec01.exam01;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		//인터페이스 MyFunctionalInterface 타입을 참조하는 변수선언
		MyFunctionalInterface fi;
		
		//람다식을 작성하여 인터페이스 변수에 대입
		fi= () -> { 
			String str = "method 호출(1)";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> { System.out.println("method 호출(2)"); };
		fi.method();
		
		fi = () -> System.out.println("method 호출(3)");
		fi.method();
	}
}











