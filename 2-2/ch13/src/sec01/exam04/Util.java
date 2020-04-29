package sec01.exam04;

public class Util {
	/*제네릭 메서드 선언
	  - 매개변수로 객체를 받아서 Box 객체를 생성하고, 필드로 저장
	 */
	public static <T> Box<T> boxing(T t) {
		
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
