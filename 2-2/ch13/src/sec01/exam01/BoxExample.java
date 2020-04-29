package sec01.exam01;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}
}
