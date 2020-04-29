package sec01.exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {
		//List �÷��� ����
		List<Student> studentList = Arrays.asList(
			new Student("�����", 97),
			new Student("�̰���", 99),
			new Student("�迬��", 95)
		);
		
		//studentList.stream()���� ��Ʈ�� ���
		Stream<Student> stream = studentList.stream();
		//�л���ü(s)�� �ϳ��� ������ s.getName()���� �̸��� ������ ���
		stream.forEach(s -> System.out.println(s.getName()));
	}
}
