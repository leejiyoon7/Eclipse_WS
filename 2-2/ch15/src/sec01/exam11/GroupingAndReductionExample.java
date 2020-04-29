package sec01.exam11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingAndReductionExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("손흥민", 95, Student.Sex.MALE),
				new Student("김연아", 96, Student.Sex.FEMALE),
				new Student("이강인", 97, Student.Sex.MALE),
				new Student("손연재", 98, Student.Sex.FEMALE)
		);
		
		//성별로 평균 점수를 저장하는 Map 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student :: getSex, //성별로 그룹핑(kay)
						Collectors.averagingDouble(Student :: getScore)//학생 점수의 평균값(value)
					)
				);
		
		System.out.println("남학생 평균 점수: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생 평균 점수: " + mapBySex.get(Student.Sex.FEMALE));
		
		//성별로 쉼표로 구분된 학생의 이름을 저장하는 Map 얻기
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student :: getSex, //성별로 그룹핑(key)
						Collectors.mapping(//(value)
							Student :: getName,//학생의 이름을 매핑
							Collectors.joining(",")//학생의 이름 연결
						)
					)
				);
		System.out.println("남학생 전체 이름: " + mapByName.get(Student.Sex.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(Student.Sex.FEMALE));
	}
}
