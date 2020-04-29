package sec01.exam07;

/*제네릭 타입(으로 Course 클래스 선언
 * Course를 다양한 사람들이 수강할 수 있음
 * T 타입 : 학생, 일반인, 근로자 등
 */
public class Course<T> {
	private String name;//과정명
	private T[] students;//수강생 배열(T타입 배열)
	
	//생성자(과정명, 최대수강인원)
	public Course(String name, int capacity) {
		this.name = name;//과정명
		//최대 수강인원을 Object 배열로 생성하여 (T[]) 타입으로 강제 타입 변환
		students = (T[]) (new Object[capacity]);
	}

	public String getName() { 
		return name; 
	}
	
	public T[] getStudents() { 
		return students; 
	}
	
	/* T 타입을 매개변수로 받는 add() 메서드
	 * T타입 객체를 매개변수로 받아서 수강생 배열(students)에 저장하는 매서드
	 * students.length는 capacity
	 */
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {//비어있는 배열 공간에 저장한 후 break
				students[i] = t;
				break;
			}
		}
	}
}

