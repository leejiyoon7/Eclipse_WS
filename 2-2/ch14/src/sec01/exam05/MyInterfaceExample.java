package sec01.exam05;

public class MyInterfaceExample {
	static String compare(MyInterface mi, String s) {
		/* 매개변수로 전달받은 람다식의 getValue()메서드 호출
		 * 호출할 때 두번째 매개변수로 받은 문자열 s를 전달
		 * 람다식을 실행한 후 반환받은 값을 다시 반환 */
		return mi.getValue(s);
	}
	
	public static void main(String[] args) {
		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		
		//MyInterface 구현하는 람다식 
		MyInterface mi1 = (s) -> {
			String result = "";
			char c;
			//매개변수 s로 전달받은 문자열의 길이만큼 반복
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);//s에서 i번째의 문자를 반환
				if (c == ',')
					result += " ";
				else
					result += c;
			}
			return result;
		};
		
		// compare()메서드 호출(매개변수로 람다식과 문자열 전달)
		String s1 = compare(mi1, str);
		System.out.println(s1);

		/* compare()메서드 호출(매개변수로 람다식과 문자열 전달) 
		 * 인터페이스 변수를 사용하지 않고 람다식 코드를 매개변수로 직접 전달
		 */
		String s2 = compare((s) -> {
			int max = 0;
			int index = 0;
			//","를 기준으로 s 문자열을 나눈 후 word 배열에 저장
			String[] word = s.split(",");
			//word 배열에 저장된 단어 개수만큼 반복(가장 긴단어를 찾아 해당요소의 인덱스값을 index에 저장)
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];//word 배열에서 index번째 값을 리턴
		}, str);
		System.out.println(s2);
	}
}
