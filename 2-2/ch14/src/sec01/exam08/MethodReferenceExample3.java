package sec01.exam08;

/* 제네릭 함수형 인터페이스 선언
 * 타입 파라미터를 위해 T를 선언  */
interface MyFunc<T> {
	int func(T[] arr, T val);
}

// MyUtil 클래스 선언
class MyUtil {
	/* 제네릭 메서드 참조(method references)를 위한 메서드 선언
	 * 제네릭 함수형 인터페이스의 추상 메서드(func())를 구현하는 메서드 선언(람다식의 실행문을 메서드로 작성)
	 * 메서드의 리턴타입과 매개변수는 함수형 인터페이스의 추상 메서드와 동일해야 함
	 * 매개변수에 타입 파라미터 T를 지정(T타입의 배열과 T 타입의 값을 매개변수로 받음)
	 * 매개변수로 받은 arr 배열에서 val 값이 몇 개 존재하는지 카운트하는 메서드
	 */
	static <T> int count(T[] arr, T val) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val)
				cnt++;
		}
		return cnt;
	}
}

public class MethodReferenceExample3 {
	/* 람다식으로 구현된 함수형 인터페이스의 func() 메서드를 호출하기 위해 선언한 메서드
	 * 첫 번째 인자는 함수형 인터페이스의 구현 객체, MyFunc 인터페이스의 추상 메서드를 구현하는 메서드 선언(람다식의 실행문을 메서드로 작성)
	 * - 메서드의 리턴타입과 매개변수는 함수형 인터페이스의 추상 메서드와 동일해야 함
	 */
	static <T> int test(MyFunc<T> mf, T[] arr, T val) {
		// mf.func()메서드 호출(매개변수로 arr, val 전달)
		return mf.func(arr, val);
	}
	
	public static void main(String[] args) {
		String[] list1 = { "blue", "red", "yellow", "blue", "red", "blue" };
		Integer[] list2 = { 10, 50, 10, 50, 40, 10, 20, 10, 20 };

		int cnt = 0;
		
		/* MyUtil::<String>count: 제네릭 메서드를 사용하여 구현 객체 생성
		   - 제네릭 함수형 인터페이스(MyFunc<T>)의 func() 메서드를 구현한
		     MyUtil 클래스의 <String>count() 제네릭 메서드로 구현 객체 생성
		 * list1: 문자열 배열
		 * "blue": 찾을 문자열
		 */
		cnt = test(MyUtil::<String>count, list1, "blue");
		System.out.println("개수 : " + cnt);

		cnt = test(MyUtil::<Integer>count, list2, 10);
		System.out.println("개수 : " + cnt);
	}
}
