package sec01.exam10;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	/* 최대값과 최소값을 리턴하는 maxOrMin() 메서드 
	 * applyAsInt(result, score): 두 개의 int를 매개변수로 받아 연산한 후 int로 반환하는 메서드
	 */
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(//IntBinaryOperator 구현객체를 생성하는 람다식
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
	}
}
