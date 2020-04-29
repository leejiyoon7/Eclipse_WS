package sec01.exam04;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("손흥민", "이강인", "손연재", "김연아", "손흥민");
		//중복제거
		names.stream()//스트림 참조
			.distinct()//중복제거
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//필터링("손"으로 시작하는 요소만 필터링)
		names.stream()
			.filter(n -> n.startsWith("손"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//중복제거 및 필터링(중복제거 및 "손"으로 시작하는 요소만 필터링)
		names.stream()
			.distinct()//중복제거
			.filter(n -> n.startsWith("손"))
			.forEach(n -> System.out.println(n));		
	}
}
