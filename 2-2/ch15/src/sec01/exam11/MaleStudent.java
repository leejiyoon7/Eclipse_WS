package sec01.exam11;

import java.util.ArrayList;
import java.util.List;

/* 사용자 정의 컨테이너로 사용할 클래스 선언
 * 남학생만 저장할 컨테이너
 */
public class MaleStudent  {
	//학생 객체를 저장하는 컬렉션 List(남학생만 저장)
	private List<Student> list;
	
	//생성자
	public MaleStudent() {
		list = new ArrayList<Student>();
		//사용하는 스레드 출력
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	//List 컬렉션에 남학생을 저장하는 메서드
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	/* 병렬처리시 사용하는 메서드(결합)
	 * 다른 컨테이너를 매개값으로 받아서, 그 컨테이너에 있는 list를 모두 최종 list에 추가(결합)
	 */
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	//list에 대한 getter 메서드
	public List<Student> getList() {
		return list;
	}
}
