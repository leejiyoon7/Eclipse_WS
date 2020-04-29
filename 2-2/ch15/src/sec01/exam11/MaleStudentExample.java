package sec01.exam11;

import java.util.Arrays;
import java.util.List;

//����� ���� �����̳ʿ� �����ϴ� Ŭ����
public class MaleStudentExample {
	public static void main(String[] args) {
		//totalList �÷��� ����
		List<Student> totalList = Arrays.asList(
				new Student("�����", 95, Student.Sex.MALE),
				new Student("�迬��", 96, Student.Sex.FEMALE),
				new Student("�̰���", 97, Student.Sex.MALE),
				new Student("�տ���", 98, Student.Sex.FEMALE)
		);
		//���л��� ���͸��Ͽ� ����� ���� �����̳�(MaleStudent)�� ����
		MaleStudent maleStudent = totalList.stream()//�������� ��Ʈ�� ���
				.filter(s -> s.getSex() == Student.Sex.MALE)//���л��� ���͸�
				.collect(
						()->new MaleStudent(), //����� ���� �����̳ʸ� �����Ͽ� ����
						/* r:������ ����� ���� �����̳�, t: ���͸��� ���
						 * �����̳� r�� �ִ� accumulate() �޼��带 ȣ���Ͽ� ��� t�� �����̳ʿ� ���� */
						(r, t)->r.accumulate(t),   
						//����ó������ ������ ���� ������ �����̳ʸ� �����Ͽ� ���� �����̳ʸ� �ϼ�
						(r1, r2)->r1.combine(r2));//����ó���� �������� ����ó�������� �����ؾ� ��
		
		        //.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine); 
		
		//����� ���� �����̳ʿ� ������ ��� ���
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}

