package sec01.exam02;

public class UsingThisExample {
	public static void main(String[] args) {
		//UsingThis 객체 생성
		UsingThis usingThis = new UsingThis();
		
		////UsingThis 클래스의 inner 클래스 객체 생성
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}

