package sec01.exam09;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)//2�� ����� ���͸��Ͽ� �߰� ��Ʈ�� ����
			.count();
		System.out.println("2�� ��� ����: " + count);
		
		long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.sum();
		System.out.println("2�� ����� ��: " + sum);
		
		double avg = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.average()
			/* average() ��ȯ���� OptionalDouble�̱� ������ �� ��ü���� ���� ��� ����
			 * getAsDouble() �޼��� ȣ��
			 */
			.getAsDouble();
		System.out.println("2�� ����� ���: " + avg);
		
		int max = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.max()
			/* max() ��ȯ���� OptionalInt�̱� ������ �� ��ü���� ���� ��� ����
			 * getAsInt() �޼��� ȣ��
			 */
			.getAsInt();
		System.out.println("�ִ밪: " + max);
		
		int min = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%2==0)
			.min()
			.getAsInt();
		System.out.println("�ּҰ�: " + min);
		
		int first = Arrays.stream(new int[] {1, 2, 3, 4, 5})
			.filter(n -> n%3==0)
			.findFirst()
			.getAsInt();
		System.out.println("ù��° 3�� ���: " + first);
	}
}