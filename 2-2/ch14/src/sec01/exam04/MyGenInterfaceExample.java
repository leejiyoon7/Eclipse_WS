package sec01.exam04;

public class MyGenInterfaceExample {
	public static void main(String[] args) {	
		/* 제네릭 함수형 인터페이스를 구현하는 람다식 선언
		 * 타입 매개변수 T에 전달할 타입 파라미터는 람다식을 참조하는 변수에 설정
		 */
		MyGenInterface<String> mgs = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mgs.getVlue("java"));
		System.out.println(mgs.getVlue("java programming"));

		MyGenInterface<Integer> mgi = (n) -> {return n * 2;};
		System.out.println(mgi.getVlue(100));
		System.out.println(mgi.getVlue(1000));
	}
}
