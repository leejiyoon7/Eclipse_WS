package sec01.exam02;

public class StudentExample {
	public static void main(String[] args) {
		/* [1] 학번과 이름이 같은 두 개의 Student 인스턴스의 동등성 비교 
		 */
		Student std1 = new Student(1001, "손흥민");
		Student std2 = new Student(1001, "손흥민");
		
		System.out.println("std1==std2:" + (std1==std2));
		System.out.println("std1.equals(std2):" + (std1.equals(std2)));
		System.out.println();

		System.out.println("std1 hashCode:" + (std1.hashCode()));
		System.out.println("std2 hashCode:" + (std2.hashCode()));
	}
}
