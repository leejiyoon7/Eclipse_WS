package sec01.exam07;

import java.util.Arrays;

public class WildCardExample {
	
	/* (Course<?> course) : 제한 없음
	    registerCourse() 메서드로  모든 수강 대상자가 모두 올 수 있음(제한 없음)
	*/
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + 
				Arrays.toString(course.getStudents()));
 	}
	
	/* (Course<? extends Student> course) : 상위 클래스 제안
	 * - registerCourseStudent() 메서드의 매개변수로 Student, HighStudent 만 올 수 있음
	 * 
	 */
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + 
				Arrays.toString(course.getStudents()) );
 	}
	
	/* (Course<? super Worker> course): 하위 클래스 제한
	 * registerCourseWorker() 매개변수로 worker, person만 올 수 있음
	 */
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + 
				Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		//일반인과정 생성
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		    //수강신청(하위클래스까지 가능)
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));
			
		//근로자과정 생성
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
			workerCourse.add(new Worker("직장인"));
			
		//학생과정 생성(하위클래스까지 가능)
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
			studentCourse.add(new Student("학생"));
			studentCourse.add(new HighStudent("고등학생"));
			
		//고등학생과정 생성
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
			highStudentCourse.add(new HighStudent("고등학생"));	
		
		//과정 등록
		//모두 가능
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//student, highStudent
		//registerCourseStudent(personCourse); 			(x)
		//registerCourseStudent(workerCourse); 			(x)
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);	
		System.out.println();
		
		//worker, person
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse); 			(x)
		//registerCourseWorker(highStudentCourse); 		(x)
	}
}
