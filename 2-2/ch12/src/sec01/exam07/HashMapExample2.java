package sec01.exam07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {

		//HashMap ��ü ����(HashMap<keyŸ��, valueŸ��>)
		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("�����ϰ�", "ó���� ���� ���� �̷���� ������ �а� ����");
		dic.put("��������", "��� ���� ��ſ��� ��");
		dic.put("�а���", "���� �μ��������� ����� ����");
		dic.put("��������", "����ϸ鼭 ������ �й��� ����");
		dic.put("����ȯ��", "�����Ͽ� ���⿡ ���ƿ�");
		dic.put(null, null); // HashMap�� null �� ���� ����

		// ���1 : keySet()
		//keySet �÷����� Iterator ��ü�� ��ȯ�Ͽ� �ݺ� ó��(��ü�� �ϳ��� ó��)
		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}

		// ���2 : entrySet()���� �ݺ�ó��(for())
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		}

		// ���3 : keySet()���� �ݺ�ó��(for())
		for (String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
	}
}
