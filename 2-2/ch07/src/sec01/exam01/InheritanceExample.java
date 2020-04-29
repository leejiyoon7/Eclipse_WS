package sec01.exam01;

public class InheritanceExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Professor prof = new Professor();
		Student std = new Student();

		emp.setName("손흥민");
		emp.setAge(27);
		emp.setDept("전산센터");

		prof.setName("이강인");
		prof.setAge(52);
		prof.setSubject("인공지능");

		std.setName("김유리");
		std.setAge(22);
		std.setMajor("컴퓨터공학");

		System.out.println(emp.toString());
		System.out.println(prof.toString());
		System.out.println(std.toString());
	}
}
