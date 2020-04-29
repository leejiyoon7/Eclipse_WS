package sec01.exam09;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)//2의 배수만 필터링하여 중간 스트림 생성
			.count();
		System.out.println("2의 배수 개수: " + count);
		
		long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.sum();
		System.out.println("2의 배수의 합: " + sum);
		
		double avg = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.average()
			/* average() 반환값이 OptionalDouble이기 때문에 이 객체에서 값을 얻기 위해
			 * getAsDouble() 메서드 호출
			 */
			.getAsDouble();
		System.out.println("2의 배수의 평균: " + avg);
		
		int max = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.max()
			/* max() 반환값이 OptionalInt이기 때문에 이 객체에서 값을 얻기 위해
			 * getAsInt() 메서드 호출
			 */
			.getAsInt();
		System.out.println("최대값: " + max);
		
		int min = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.min()
			.getAsInt();
		System.out.println("최소값: " + min);
		
		int first = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%3==0)
			.findFirst()
			.getAsInt();
		System.out.println("첫번째 3의 배수: " + first);
	}
}
