package sec01.exam02;

public class BoxExample {

	public static void main(String[] args) {		
		Box<String> box = new Box<String>();
		//box.set(1);//error
		box.set("º’»ÔπŒ");
		
		String name = box.get();		
		System.out.println("name:" + name);
		
		Box<Integer> box2 = new Box<Integer>();
		//box2.set("º’»ÔπŒ");//error
		box2.set(1001);
		
		int seq = box2.get();		
		System.out.println("seq:" + seq);
	}
}
