package sec01.exam04;

public class BoxingMethodExample {
	public static void main(String[] args) {
		//Util 클래스의 정적 boxing()메서드를 호출하여 리턴값을 Box<Integer>타입 변수 box1에 저장
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println("intValue:" + intValue);
		
		/* Util 클래스의 정적 boxing()메서드를 호출할 때, 구체적인 타입을 지정하지 않으면
		      컴파일러는매개변수값에 따라 추론하여 String타입으로 지정
		   - 리턴값을 Box<String>타입 변수 box2에 저장
		*/
		Box<String> box2 = Util.boxing("손흥민");
		String strValue = box2.get();
		System.out.println("strValue:" + strValue);
	}
}
