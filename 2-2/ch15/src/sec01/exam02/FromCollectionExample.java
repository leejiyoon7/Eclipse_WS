package sec01.exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<Student> studentList = Arrays.asList(
			new Student("손흥민", 97),
			new Student("이강인", 99),
			new Student("김연아", 95)
		);
		
		//studentList.stream()으로 스트림 얻기
		Stream<Student> stream = studentList.stream();
		//학생객체(s)를 하나씩 가져와 s.getName()으로 이름을 가져와 출력
		stream.forEach(s -> System.out.println(s.getName()));
	}
}
