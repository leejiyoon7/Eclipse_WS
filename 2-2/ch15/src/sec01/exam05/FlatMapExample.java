package sec01.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapExample {
	public static void main(String[] args) {
		//�� ���� ��Ҹ� ���� �÷��� ����
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		//inputList1 �÷����� �� ����� �ܾ���� ����(" ")���� �и��Ͽ� ���ο� ��Ʈ���� �����Ͽ� ���
		inputList1.stream()//�������� ��Ʈ�� ����
		     /* �� ����� �ܾ���� �������� �и��Ͽ� �迭�� ������ ��, �迭���� stream�� ���� 
		      * �߰� ��Ʈ���� �����ϰ�, forEach()������ ��Ҹ� �ϳ��� ���
		      */
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		//�� ���� ��Ҹ� ���� �÷��� ����
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		
		//inputList2 �÷����� �� ����� ���ڵ��� �޸�(",")���� �и��Ͽ�, ���ڸ� ��Ҹ� ���� ���ο� ��Ʈ���� �����Ͽ� ���
		inputList2.stream()
		    //flatMapToInt(): ���ڿ��� �ִ� ���� ���ڷ� �и��Ͽ� IntStream���� ��ȯ�ϴ� �޼���
			.flatMapToInt(data -> {
				//�� ����� ���ڵ��� �޸��� �и��Ͽ� String �迭�� ����
				String[] strArr = data.split(",");
				//���ڸ� ������ int �迭 �����ϰ�, ���ڿ�(����)�� int�� ��ȯ�Ͽ� �迭�� ����
				int[] intArr = new int[strArr.length];
				for(int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);//IntStream ����(�߰� ��Ʈ�� ����)
			})
			.forEach(number -> System.out.println(number));//�߰� ��Ʈ������ ��� ���
	}
}
