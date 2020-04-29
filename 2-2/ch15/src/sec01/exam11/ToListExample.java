package sec01.exam11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		//totalList 컬렉션 생성
		List<Student> totalList = Arrays.asList(
				new Student("손흥민", 95, Student.Sex.MALE),
				new Student("김연아", 96, Student.Sex.FEMALE),
				new Student("이강인", 97, Student.Sex.MALE),
				new Student("손연재", 98, Student.Sex.FEMALE)
		);
		
		/* 남학생들만 묶어 List 컬렉션 생성
		 * collect() 메서드의 리턴값은 List 컬렉션
		 */
		List<Student> maleList = totalList.stream()//오리지널 스트림 참조
				.filter(s->s.getSex()==Student.Sex.MALE)//남학생 필터링
				//Collectors.toList() 메서드를 호출하여 List 컬렉션을 생성하여 남학생 요소 저장하여 리턴				
				.collect(Collectors.toList());
		
		//maleList에서 스트림을 얻어내어 요소값을(학생이름) 출력
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		/* 여학생들만 묶어 HashSet 컬렉션 생성
		 * Collectors.toCollection() 메서드의 리턴값은 Set 컬렉션
		 */
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				//Collectors.toCollection() 메서드를 호출하여 HashSet 컬렉션을 생성하여 여학생 요소를 저장하여 리턴	
				.collect(Collectors.toCollection(HashSet :: new));
				//.collect( Collectors.toCollection(()->{return new HashSet<Student>();}) );
				//.collect( Collectors.toCollection(()->new HashSet<Student>()) );
		
		//femaleSet에서 스트림을 얻어내어 요소값을(학생이름) 출력
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
