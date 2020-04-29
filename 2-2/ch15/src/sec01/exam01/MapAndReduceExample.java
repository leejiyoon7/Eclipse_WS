package sec01.exam01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("�����", 95),
				new Student("�̰���", 93),
				new Student("�迬��", 97)
		);		
		//�������� ��Ʈ�� ��ü�� ����	(Student ��ü�� ��Ҹ� ���� ��Ʈ��)
		double avg = studentList.stream()
			//mapToInt(): �߰�ó��(�л� ��ü�� ������ �����Ͽ� ����)
			.mapToInt(Student :: getScore)
			//average(): ���� ó��(��� ������ ���ϴ� �޼���)
			.average().getAsDouble();//��հ��� Double������ ����
		
		System.out.println("��� ����: " + avg);
	}
}
