package sec01.exam11;

import java.util.Arrays;
import java.util.List;

//사용자 정의 컨테이너에 누적하는 클래스
public class MaleStudentExample {
	public static void main(String[] args) {
		//totalList 컬렉션 생성
		List<Student> totalList = Arrays.asList(
				new Student("손흥민", 95, Student.Sex.MALE),
				new Student("김연아", 96, Student.Sex.FEMALE),
				new Student("이강인", 97, Student.Sex.MALE),
				new Student("손연재", 98, Student.Sex.FEMALE)
		);
		//남학생만 필터링하여 사용자 정의 컨테이너(MaleStudent)에 누적
		MaleStudent maleStudent = totalList.stream()//오리지널 스트림 얻기
				.filter(s -> s.getSex() == Student.Sex.MALE)//남학생만 필터링
				.collect(
						()->new MaleStudent(), //사용자 정의 컨테이너를 생성하여 리턴
						/* r:생성한 사용자 정의 컨테이너, t: 필터링된 요소
						 * 컨터이너 r에 있는 accumulate() 메서드를 호출하여 요소 t를 컨테이너에 누적 */
						(r, t)->r.accumulate(t),   
						//병렬처리에서 스레드 별로 생성된 컨테이너를 결합하여 최종 컨테이너를 완성
						(r1, r2)->r1.combine(r2));//병렬처리시 사용되지만 순차처리에서도 선언해야 함
		
		        //.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine); 
		
		//사용자 정의 컨테이너에 누적된 요소 출력
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}

