package sec01.exam12;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		//totalList 컬렉션 생성
		List<Student> totalList = Arrays.asList(
				new Student("손흥민", 97, Student.Sex.MALE),
				new Student("김연아", 95, Student.Sex.FEMALE),
				new Student("이강인", 92, Student.Sex.MALE),
				new Student("박정현", 98, Student.Sex.FEMALE)
		);
		
		//남학생을 병렬처리
		MaleStudent maleStudent = totalList.parallelStream()//병렬처리 스트림 얻기
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine); 
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
