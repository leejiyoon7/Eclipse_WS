package sec01.exam10;

import java.util.function.Function;

public class FunctionExample1 {
	public static void main(String[] args) {
		//문자열(String)을 매개변수로 받아 Integer 객체로 매핑하여 리턴
		Function<String, Integer> func = (s) -> {
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};

		int wordCnt = func.apply("Function 함수형 인터페이스는 매개 값을 받아 매핑하여 리턴 값으로 제공하는 기능 수행");
		System.out.println("단어 수 : " + wordCnt);
	}
}
