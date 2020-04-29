package sec05.exam01;

public class ThisExample {
	//필드
	int i = 1;
	
    //메소드
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;
		System.out.println("first(), this.i: " + this.i);
		
		second(4);
	}

	public void second(int i) {
		int j = 5;
		this.i = i + j;
		System.out.println("second(), this.i: " + this.i);
	}

	public static void main(String[] args) {
		ThisExample exam = new ThisExample();
		exam.first();
	}
}
