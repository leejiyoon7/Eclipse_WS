package sec01.exam10;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		// studentList �÷��� ����
		List<Student> studentList = Arrays.asList(
				new Student("�����", 92),
				new Student("�̰���", 95),
				new Student("�¿�", 98)
		);
		
		//�������� ��Ʈ�� ���� 
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)//Student��ü�� ������ ����
				.sum();//sum() �⺻���� �޼���� ���� ��� 
		
		int sum2 = studentList.stream()
				.mapToInt(Student :: getScore)
				//������ �Ű�����(a, b)�� �޾Ƽ� ���� ���(��� �� ��ŭ �ݺ�)
				.reduce((a, b) -> a+b)//���� �޼���
				//reduce�� ����Ÿ���� Optional�̱� ������ ���� ��� ���� getAsInt()�޼��� ȣ��				
				.getAsInt();
		
		int sum3 = studentList.stream()
				.mapToInt(Student :: getScore)
				//���� ������ ����� ���� �����ϰ�, ���� ������ �⺻��(0)�� ����
				.reduce(0, (a, b) -> a+b);//�⺻���� 0���� ����
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}
