package sec01.exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("�λ�");
		list.add("����");
		list.add("����");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==============");

		/* iterator() �޼���� �÷��� ��ü�� Iterator ��ü�� ��ȯ�Ͽ� ��ȯ
		 * ��� List, Set �迭�� �÷��� ��ü�� Iterator ��ü�� ��ȯ�Ͽ� ��� ����  */
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {//���� Ŀ�� ������ ��Ұ� �ִ��� �Ǵ�
			System.out.println(iter.next());//Ŀ�� ���� ��Ҹ� ��ȯ�ϰ�, Ŀ���� ���� ��ҷ� �̵�
		}
	}
}
