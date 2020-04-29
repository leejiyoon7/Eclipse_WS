package sec01.exam07;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		//���� �迭 ����
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("[peek()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)//IntStream ����
			.filter(a -> a%2==0)//¦���� ���͸��Ͽ� �߰� ��Ʈ�� ����
			//peek()�� �߰�ó�� �޼����̱� ������ ����ó�� �޼��尡 ������� ������ ���� �ȵ�
			.peek(n -> System.out.println(n));
		
		System.out.println("[���� ó�� �޼ҵ带 �������� ȣ���� ���]");
		int total = Arrays.stream(intArr)
			.filter(a -> a%2==0)
			.peek(n -> System.out.println(n))//������
			.sum();//���� ���Ͽ� ��ȯ�ϴ� ����ó�� �޼���
		
		System.out.println("����: " + total);
		
		System.out.println("[forEach()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
			.filter(a -> a%2!=0)
			.forEach(n -> System.out.println(n)); //������
	}
}

