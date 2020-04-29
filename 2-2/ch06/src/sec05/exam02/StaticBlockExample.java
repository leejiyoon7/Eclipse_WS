package sec05.exam02;

public class StaticBlockExample {
	//static code block
	static {
		System.out.println("static");
		System.out.println("block");
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("main");
	}
}
