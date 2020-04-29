package sec01.exam01;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		//nameList �÷���
		List<String> nameList = Arrays.asList("�����", "�̰���", "�տ���", "������");
		
		//�̸��� "��"�� �� �ִ� ��� count(���-1)
		long count = 0;
		for(String name: nameList) {
			if(name.contains("��")) {
				count++;
			}
		}
		System.out.println("count:" + count);
		
		//�̸��� "��"�� �� �ִ� ��� count(���-2)
		count = 0;		
		count = nameList.stream()
				        .filter( (s) -> s.contains("��")).count();
		System.out.println("count:" + count);
	}
}
