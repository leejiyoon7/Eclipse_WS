package sec01.exam09;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<String, String>();

		users.put("20190301", "��Ǫ��");
		users.put("20180620", "���ϴ�");
		users.put("20170817", "������");
		users.put("20190728", "������");
		users.put("20150924", "������");

		System.out.println(users);

		Map.Entry<String, String> entry = null;

		entry = users.firstEntry();//ù��° Entry ��ȯ
		print("�Ի����ڰ� ���� ���� ��� ", entry);

		entry = users.lastEntry();//�ʿ��� ���� ū Ű���� Entry ��ȯ
		print("�Ի����ڰ� ���� ���� ���", entry);

		entry = users.lowerEntry("20191231");//������ Ű���� ���� �� ��, ���� ���� Ű���� Entry ��ȯ
		print("2012�⵵�� ���� �ʰ� �Ի��� ���", entry);

		entry = users.higherEntry("20190101");//������ Ű���� ū �� ��, ���� ū Ű���� Entry ��ȯ
		print("2019�⵵�� ���� ������ �Ի��� ���", entry);

		//��� Entry�� ��ȯ�� �� ���� 
		while (!users.isEmpty()) {
			//���� ���� ���� ���� Ű���� Entry�� ��ȯ�� �� ���� 
			entry = users.pollFirstEntry();
			print("������ ���", entry);
			System.out.println("�����ִ� ���� �� : " + users.size());
		}
	}

	public static void print(String s, Map.Entry<String, String> entry) {
		System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
	}
}
