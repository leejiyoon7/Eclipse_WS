package sec01.exam07;

//함수형 인터페이스 선언
interface StringFunc {
	String modify(String s);
}

public class MethodReferenceExample {
	/* static 메서드 참조(method references)를 위한 메서드 선언
	 * - 인터페이스의 추상 메서드를 구현하는 메서드 선언(람다식의 실행문을 메서드로 작성)
	 * - 메서드의 리턴타입과 매개변수는 함수형 인터페이스의 추상 메서드와 동일해야 함
	 */
	static String func(String s) {
		String result = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == ',')
				result += " ";
			else
				result += c;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		
		//StringFunc 인터페이스를 구현하는 람다식 
		StringFunc sf = (s) -> {
			String result = "";
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c == ',')
					result += " ";
				else
					result += c;
			}
			return result;
		};		
		
		String result;
		
		System.out.println("[람다식 사용]");		
		result = sf.modify(str);
		System.out.println(result);	
		
		System.out.println("[static 메서드 참조 사용]");
		
		/* static 메서드 참조로 인터페이스의 익명 구현 객체 생성
		 * 문법 : 인터페이스 변수 = 클래스명::메서드명; */
		StringFunc sf2 = MethodReferenceExample::func;		
		result = sf2.modify(str);
		System.out.println(result);
	}
}
