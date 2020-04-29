package sec01.exam04;

//제네릭 타입으로 Box 클래스 선언
public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
