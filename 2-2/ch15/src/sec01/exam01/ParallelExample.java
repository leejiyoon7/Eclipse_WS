package sec01.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("손흥민", "이강인", "손연재", "김연아", "황의조");
		
		//순차 처리
		Stream<String> stream = list.stream();
		//stream.forEach( (name) -> print(name));
		/* static 메서드 참조로 익명 구현 객체 생성(클래스이름::메서드명) 
		 * 스트림에서 forEach()로 요소를 하나씩 가져와 처리하는 람다식을 메서드 참조로 구현
		 */
		stream.forEach(ParallelExample :: print);
		
		System.out.println();
		
		//병렬 처리
		/* parallelStream() 메서드로 병렬처리가 가능한 스트림을 가져옴
		 * 컬렉션 내부적으로 멀티 스레드로 병렬처리 수행 
		 */
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}
	
	public static void print(String str) {
		System.out.println(str+ " : " + Thread.currentThread().getName());
	}	
}
