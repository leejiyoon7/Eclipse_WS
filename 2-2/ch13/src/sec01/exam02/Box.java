package sec01.exam02;

//제네릭 타입으로 클래스 선언
public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
