package sec01.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		/* 숫자 요소일 경우
		 * 정수 배열에서 IntStream을 가져옴	 */
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		
		//intStream에서 정렬
		intStream
			.sorted()//올림차순 정렬
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		//객체 요소일 경우
		List<Student> studentList = Arrays.asList(
			new Student("손흥민", 95),
			new Student("이강인", 97),
			new Student("김연아", 93)
		);
		
		//기본 정렬
		studentList.stream()
			.sorted( )//올림차순 정렬
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		//기본 정렬의 반대로 정렬(내림차순 정렬)
		studentList.stream()
		.sorted( Comparator.reverseOrder() )//내림 차순 정렬
		.forEach(s -> System.out.print(s.getScore() + ","));	
	}
}
