package sec01.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		/* ���� ����� ���
		 * ���� �迭���� IntStream�� ������	 */
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		
		//intStream���� ����
		intStream
			.sorted()//�ø����� ����
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		//��ü ����� ���
		List<Student> studentList = Arrays.asList(
			new Student("�����", 95),
			new Student("�̰���", 97),
			new Student("�迬��", 93)
		);
		
		//�⺻ ����
		studentList.stream()
			.sorted( )//�ø����� ����
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		//�⺻ ������ �ݴ�� ����(�������� ����)
		studentList.stream()
		.sorted( Comparator.reverseOrder() )//���� ���� ����
		.forEach(s -> System.out.print(s.getScore() + ","));	
	}
}
