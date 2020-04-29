package sec01.exam08;

import java.util.Arrays;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };
		
		//정수 배열에서 IntStream 참조
		boolean result = Arrays.stream(intArr)
			.allMatch(a -> a%2==0);//모든 요소의 나머지가 0이면
		System.out.println("모두 2의 배수인가? " + result);
		
		result = Arrays.stream(intArr)
			.anyMatch(a -> a%3==0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr)
			.noneMatch(a -> a%3==0);
		System.out.println("3의 배수가 없는가?  " + result);
	}
}
