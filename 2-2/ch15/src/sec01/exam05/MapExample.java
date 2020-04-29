package sec01.exam05;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		//studentList �÷��� ����
		List<Student> studentList = Arrays.asList(
				new Student("�����", 97),
				new Student("�̰���", 95),
				new Student("�迬��", 96)
		);
			
		//��ü�� Int(����)�� ��ȯ�ϴ� �߰� ��Ʈ���� �����Ͽ� ������ ���
		studentList.stream()
			//Student ��ü�� getScore() �޼��带 ȣ���Ͽ� ������ ��ҷ� �ϴ� �߰���Ʈ�� ����
			.mapToInt(Student :: getScore)//����
			.forEach(score -> System.out.println(score));
	}
}
