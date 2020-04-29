package sec01.exam10;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		// studentList 컬렉션 생성
		List<Student> studentList = Arrays.asList(
				new Student("손흥민", 92),
				new Student("이강인", 95),
				new Student("태연", 98)
		);
		
		//오리지널 스트림 참조 
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)//Student객체를 점수로 맵핑
				.sum();//sum() 기본집계 메서드로 합을 계산 
		
		int sum2 = studentList.stream()
				.mapToInt(Student :: getScore)
				//점수를 매개변수(a, b)로 받아서 합을 계산(요소 수 만큼 반복)
				.reduce((a, b) -> a+b)//집계 메서드
				//reduce의 리턴타입이 Optional이기 때문에 값을 얻기 위해 getAsInt()메서드 호출				
				.getAsInt();
		
		int sum3 = studentList.stream()
				.mapToInt(Student :: getScore)
				//합이 있으면 집계된 합을 리턴하고, 합이 없으면 기본값(0)을 리턴
				.reduce(0, (a, b) -> a+b);//기본값을 0으로 설정
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}
