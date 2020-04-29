package sec01.exam05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		//정수배열 생성
		int[] intArray = { 1, 2, 3, 4, 5};
		
		//정수 배열에서 IntStream 가져오기
		IntStream intStream = Arrays.stream(intArray);
		
		//IntStream의 int 요소를 double 타입 요소로 매핑해서  DoubleStream 생성
		intStream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
			
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		
		//IntStream의 int 요소를 Integer 객체로 박싱해서 Stream 객체 생성
		intStream
			.boxed()
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
