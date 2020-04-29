package sec01.exam08;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableExample {
	public static void main(String[] args) {

		//Hashtable ��ü ����(Hashtable<keyŸ��, valueŸ��>)
		Hashtable<String, String> dic = new Hashtable<String, String>();

		dic.put("�����ϰ�", "ó���� ���� ���� �̷���� ������ �а� ����");
		dic.put("��������", "��� ���� ��ſ��� ��");
		dic.put("�а���", "���� �μ��������� ����� ����");
		dic.put("��������", "����ϸ鼭 ������ �й��� ����");
		dic.put("����ȯ��", "�����Ͽ� ���⿡ ���ƿ�");

		System.out.println("dic:" + dic);
		System.out.println("dic.keySet:" + dic.keySet());
		System.out.println("dic.values:" + dic.values());
		System.out.println(dic.get("�����ϰ�"));//Ű�� ������ null
		
		System.out.println();
		
		// ���1 : keySet()
		//keySet �÷����� Iterator ��ü�� ��ȯ�Ͽ� �ݺ� ó��(��ü�� �ϳ��� ó��)
		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}

		System.out.println();
		
		// ���2 : entrySet()���� �ݺ�ó��(for())
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		}

		System.out.println();
		
		// ���3 : keySet()���� �ݺ�ó��(for())
		for (String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
	}
}
