package sec01.exam01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("손흥민", 95),
				new Student("이강인", 93),
				new Student("김연아", 97)
		);		
		//오리지널 스트림 객체를 참조	(Student 객체를 요소를 갖는 스트림)
		double avg = studentList.stream()
			//mapToInt(): 중간처리(학생 객체를 점수로 매핑하여 리턴)
			.mapToInt(Student :: getScore)
			//average(): 최종 처리(평균 점수를 구하는 메서드)
			.average().getAsDouble();//평균값을 Double값으로 받음
		
		System.out.println("평균 점수: " + avg);
	}
}
