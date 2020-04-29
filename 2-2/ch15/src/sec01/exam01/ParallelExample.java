package sec01.exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("�����", "�̰���", "�տ���", "�迬��", "Ȳ����");
		
		//���� ó��
		Stream<String> stream = list.stream();
		//stream.forEach( (name) -> print(name));
		/* static �޼��� ������ �͸� ���� ��ü ����(Ŭ�����̸�::�޼����) 
		 * ��Ʈ������ forEach()�� ��Ҹ� �ϳ��� ������ ó���ϴ� ���ٽ��� �޼��� ������ ����
		 */
		stream.forEach(ParallelExample :: print);
		
		System.out.println();
		
		//���� ó��
		/* parallelStream() �޼���� ����ó���� ������ ��Ʈ���� ������
		 * �÷��� ���������� ��Ƽ ������� ����ó�� ���� 
		 */
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
	}
	
	public static void print(String str) {
		System.out.println(str+ " : " + Thread.currentThread().getName());
	}	
}
