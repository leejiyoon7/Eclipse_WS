package sec01.exam06;
import java.util.Arrays;

public class MyInterfaceExample {
	
	public static void main(String[] args) throws EmptyStringException {

		String str = "Korea,Australia,China,Germany,Spain,Turkey";

		////MyInterface 구현하는 람다식 
		MyInterface mi = (s) -> {
			if (s.length() == 0) {//빈 문자열이면 EmptyStringException 발생
				throw new EmptyStringException();
			}
			//s 문자열을 ","를 구분자로 분리하여 반환
			return s.split(",");
		};

		//mi.getValue() 메서드 호출
		String result[] = mi.getValue(str);
		System.out.println(Arrays.toString(result));//배열의 값을 문자열로 반환

		//빈 문자열을 인자로 mi.getValue() 메서드 호출(예외발생)
		String str2 = "";
		String result2[] = mi.getValue(str2);
		System.out.println(Arrays.toString(result2));
	}
}

