package sec01.exam02;

public class StudentExample {
	public static void main(String[] args) {
		Student std = new Student("ȫ�浿", "123456-1234567", 1001);
		
		System.out.println("name:" + std.name);
		System.out.println("ssn:" + std.ssn);
		System.out.println("stdNo:" + std.stdNo);
	}
}
