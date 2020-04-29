package sec01.exam04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		//String Ÿ���� �� LinkedList ����
		LinkedList<String> list = new LinkedList<String>();

		//������ �߰�
		list.add("����");
		list.add("�ϰ�");
		list.add("����");

		//��� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}

		list.add(1, "LA");//�ε��� 1�� LA�߰�
		print(1, list);
		list.addFirst("����");//ù��忡 �����߰�
		print(2, list);
		list.addLast("����");//������ ���� �����߰�
		print(3, list);

		list.offer("�ĸ�");//����Ʈ�� ���� �ĸ��� �߰��ϰ� true��ȯ(������ false)
		print(4, list);
		list.offerFirst("�θ�");//����Ʈ�� ù��° ���� �θ��� �߰��ϰ� true��ȯ
		print(5, list);
		list.offerLast("����");//����Ʈ�� ������ ���� ������ �߰��ϰ� true��ȯ
		print(6, list);

		System.out.println("7 : " + list.peek());//ù���� ��� ����
		System.out.println("8 : " + list.peekFirst());//ù���� ��� ����
		System.out.println("9 : " + list.peekLast());//������ ��� ����

		list.poll();//ù���� ��带 �����ϰ� list���� ����
		print(10, list);
		list.pollFirst();//ù���� ��带 �����ϰ� list���� ����
		print(11, list);
		list.pollLast();//������ ��带 �����ϰ� list���� ����
		print(12, list);

		list.push("����");//ù���� ��ġ�� ���� �߰�
		print(13, list);
		System.out.println("14 : " + list.pop());//ù���� ��ġ�� ������ ����/����
		
		System.out.println("15 : " + list.get(3));//�ε��� 3�� ������ ����
		System.out.println("16 : " + list.getFirst());//ù���� ��ġ�� ������ ����
		System.out.println("17 : " + list.getLast());//������ ��ġ�� ������ ����

		System.out.println("18 : " + list.indexOf("����"));//�տ������� ������ ã�� �ε��� ��ȯ
		System.out.println("19 : " + list.lastIndexOf("����"));//�ڿ������� ������ ã�� �ε��� ��ȯ

		list.removeFirst();//ù��° ������ ����
		print(20, list);
		list.removeLast();//������ ������ ����
		print(21, list);
		list.remove(3);//3�� ���ؽ� ������ ����
		print(22, list);
		list.remove("LA");//LA �����͸� ã�� ����
		print(23, list);

		//List ��ü ����
		List<String> list2 = Arrays.asList("�ϰ�", "����");
		list.addAll(list2);//list2�� list�� �߰�

		Object obj[] = list.toArray();//List ��ü�� Object Ÿ���� �Ϲ� �迭�� ��ȯ
		System.out.println("24 : " + Arrays.toString(obj));

		String cities[] = new String[0];
		cities = list.toArray(cities);//cities Ÿ�� �迭�� List �迭�� ��ȯ�Ͽ� ��ȯ
		System.out.println("25 : " + Arrays.toString(cities));

		list.removeAll(list2);//��� ������ ����
		print(26, list);
	}

	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}
}
