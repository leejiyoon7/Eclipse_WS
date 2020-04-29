package sec01.exam04;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("�����", "�̰���", "�տ���", "�迬��", "�����");
		//�ߺ�����
		names.stream()//��Ʈ�� ����
			.distinct()//�ߺ�����
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//���͸�("��"���� �����ϴ� ��Ҹ� ���͸�)
		names.stream()
			.filter(n -> n.startsWith("��"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//�ߺ����� �� ���͸�(�ߺ����� �� "��"���� �����ϴ� ��Ҹ� ���͸�)
		names.stream()
			.distinct()//�ߺ�����
			.filter(n -> n.startsWith("��"))
			.forEach(n -> System.out.println(n));		
	}
}
