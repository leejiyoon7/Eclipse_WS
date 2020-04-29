package sec01.exam05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		//�����迭 ����
		int[] intArray = { 1, 2, 3, 4, 5};
		
		//���� �迭���� IntStream ��������
		IntStream intStream = Arrays.stream(intArray);
		
		//IntStream�� int ��Ҹ� double Ÿ�� ��ҷ� �����ؼ�  DoubleStream ����
		intStream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
			
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		
		//IntStream�� int ��Ҹ� Integer ��ü�� �ڽ��ؼ� Stream ��ü ����
		intStream
			.boxed()
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
