package sec01.exam01;

public class InheritanceExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Professor prof = new Professor();
		Student std = new Student();

		emp.setName("�����");
		emp.setAge(27);
		emp.setDept("���꼾��");

		prof.setName("�̰���");
		prof.setAge(52);
		prof.setSubject("�ΰ�����");

		std.setName("������");
		std.setAge(22);
		std.setMajor("��ǻ�Ͱ���");

		System.out.println(emp.toString());
		System.out.println(prof.toString());
		System.out.println(std.toString());
	}
}
