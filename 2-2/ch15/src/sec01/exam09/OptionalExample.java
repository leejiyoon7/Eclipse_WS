package sec01.exam09;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		//요소값이 없는 list 컬렉션 생성
		List<Integer> list = new ArrayList<>();
		
		/*//예외 발생(java.util.NoSuchElementException)
		double avg = list.stream()
			.mapToInt(Integer :: intValue)
			.average()	
			.getAsDouble(); 
		*/
		
		//방법1
		OptionalDouble optional = list.stream()
			.mapToInt(Integer :: intValue)
			.average();	
		if(optional.isPresent()) {//값이 있으면
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}
		
		//방법2
		double avg = list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.orElse(0.0);//값이 없으면 기본값 설정
		System.out.println("방법2_평균: " + avg);
		
		//방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			//평균 값(a)이 있다면
			.ifPresent(a -> System.out.println("방법3_평균: " + a));
	}
}
