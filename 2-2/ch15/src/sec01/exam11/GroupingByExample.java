package sec01.exam11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		//컬렉션 생성
		List<Student> totalList = Arrays.asList(
				new Student("손흥민", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김연아", 6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("이강인", 10, Student.Sex.MALE, Student.City.Pusan),
				new Student("박정현", 6, Student.Sex.FEMALE, Student.City.Seoul)
		);
		
		/* 성별로 학생 객체를 그룹핑해서 Map 객체 생성
		 * Map 타입 변수 선언<key:학생의 성별, value:학생 List 컬렉션> 변수명 */
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()//오리지널 스트림 얻기
				//학생의 성별 key로 그룹핑하여 Map 컬렉션 생성(요소:Student 객체)
				.collect(Collectors.groupingBy(Student :: getSex));
		
		//남학생 그룹핑 컬렉션 확인
		System.out.print("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream()
		        .forEach(s->System.out.print(s.getName() + " "));
		
		//여학생 그룹핑 컬렉션 확인
		System.out.print("\n[여학생] ");		
		mapBySex.get(Student.Sex.FEMALE).stream()
		        .forEach(s->System.out.print(s.getName() + " "));
		
		System.out.println();
		
		/* 학생의 거주지별로 학생 객체를 그룹핑해서 Map 객체 생성
		 * Map 타입 변수 선언<key:학생의 거주지, value:학생 이름> 변수명 */
		Map<Student.City, List<String>> mapByCity = totalList.stream()//오리지널 스트림 얻기
				.collect(
						Collectors.groupingBy(//거주지 별로 그룹핑
								Student::getCity, //key: 학생의 거주지
								//value: 학생 이름(학생 객체를 이름으로 맵핑하여 이름을 List 컬렉션에 저장)
								Collectors.mapping(Student::getName, Collectors.toList())
						)
				); 
		
		// 서울 거주자 컬렉션 확인
		System.out.print("\n[서울] ");
		//거주지가 서울인 학생 List를 얻어내어, List에서 오리지널 스트림을 얻어 출력
		mapByCity.get(Student.City.Seoul).stream()
		         .forEach(s->System.out.print(s + " "));
		// 부산 거주자 컬렉션 확인
		System.out.print("\n[부산] ");
		//거주지가 부산인 학생 List를 얻어내어, List에서 오리지널 스트림을 얻어 출력
		mapByCity.get(Student.City.Pusan).stream()
		         .forEach(s->System.out.print(s + " "));	
	}
}
