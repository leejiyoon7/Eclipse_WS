package sec01.exam07;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		//정수 배열 생성
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)//IntStream 참조
			.filter(a -> a%2==0)//짝수만 필터링하여 중간 스트림 생성
			//peek()는 중간처리 메서드이기 때문에 최종처리 메서드가 실행되지 않으면 동작 안됨
			.peek(n -> System.out.println(n));
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)
			.filter(a -> a%2==0)
			.peek(n -> System.out.println(n))//동작함
			.sum();//합을 구하여 반환하는 최종처리 메서드
		
		System.out.println("총합: " + total);
		
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a -> a%2!=0)
			.forEach(n -> System.out.println(n)); //동작함
	}
}

