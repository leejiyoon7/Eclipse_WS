package sec01.exam05;

public class CompareMethodExample {
	public static void main(String[] args) {
		//Pair 객체 생성
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		
		//Util.<>compare()메서드를 호출하여 비교
		boolean isRresult1 = Util.<Integer, String>compare(p1, p2);
		
		if(isRresult1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		//Pair 객체 생성
		Pair<String, String> p3 = new Pair<String, String>("user1", "손흥민");
		Pair<String, String> p4 = new Pair<String, String>("user2", "손흥민");
		
		/* Util.compare()메서드를 호출하여 비교
		 * - 구체적인 타입을 지정하지 않으면  컴파일러는매개변수값에 따라 추론하여 String타입으로 지정
		 */
		boolean isRresult2 = Util.compare(p3, p4);
		
		if(isRresult2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
	}
}
