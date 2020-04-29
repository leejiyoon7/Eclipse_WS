package sec01.exam07;

import java.util.Arrays;

public class WildCardExample {
	
	/* (Course<?> course) : ���� ����
	    registerCourse() �޼����  ��� ���� ����ڰ� ��� �� �� ����(���� ����)
	*/
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " + 
				Arrays.toString(course.getStudents()));
 	}
	
	/* (Course<? extends Student> course) : ���� Ŭ���� ����
	 * - registerCourseStudent() �޼����� �Ű������� Student, HighStudent �� �� �� ����
	 * 
	 */
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + 
				Arrays.toString(course.getStudents()) );
 	}
	
	/* (Course<? super Worker> course): ���� Ŭ���� ����
	 * registerCourseWorker() �Ű������� worker, person�� �� �� ����
	 */
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + 
				Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		//�Ϲ��ΰ��� ����
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		    //������û(����Ŭ�������� ����)
			personCourse.add(new Person("�Ϲ���"));
			personCourse.add(new Worker("������"));
			personCourse.add(new Student("�л�"));
			personCourse.add(new HighStudent("����л�"));
			
		//�ٷ��ڰ��� ����
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
			workerCourse.add(new Worker("������"));
			
		//�л����� ����(����Ŭ�������� ����)
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
			studentCourse.add(new Student("�л�"));
			studentCourse.add(new HighStudent("����л�"));
			
		//����л����� ����
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�����", 5);
			highStudentCourse.add(new HighStudent("����л�"));	
		
		//���� ���
		//��� ����
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
