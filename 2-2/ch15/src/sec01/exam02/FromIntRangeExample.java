package sec01.exam02;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;
	
	public static void main(String[] args) {
		//rangeClosed(1,  100): 1~100범위에 해당하는 정수를 가져와서 IntStream 가져오기
		IntStream stream = IntStream.rangeClosed(1,  100);
		
		stream.forEach(a -> sum += a);//1~100까지의 합
		System.out.println("총합: " + sum);
	}
}
