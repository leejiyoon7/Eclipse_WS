package sec01.exam05;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		//studentList 컬렉션 생성
		List<Student> studentList = Arrays.asList(
				new Student("손흥민", 97),
				new Student("이강인", 95),
				new Student("김연아", 96)
		);
			
		//객체를 Int(점수)로 변환하는 중간 스트림을 생성하여 점수를 출력
		studentList.stream()
			//Student 객체의 getScore() 메서드를 호출하여 점수를 요소로 하는 중간스트림 생성
			.mapToInt(Student :: getScore)//매핑
			.forEach(score -> System.out.println(score));
	}
}
