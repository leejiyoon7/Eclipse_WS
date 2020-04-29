package sec01.exam12;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		//totalList �÷��� ����
		List<Student> totalList = Arrays.asList(
				new Student("�����", 97, Student.Sex.MALE),
				new Student("�迬��", 95, Student.Sex.FEMALE),
				new Student("�̰���", 92, Student.Sex.MALE),
				new Student("������", 98, Student.Sex.FEMALE)
		);
		
		//���л��� ����ó��
		MaleStudent maleStudent = totalList.parallelStream()//����ó�� ��Ʈ�� ���
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine); 
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
