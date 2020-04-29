package sec01.exam07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("�����", 95);
		map.put("�̰���", 90);
		map.put("�����", 97);//Ű�� �ߺ��Ǹ� �������� ����� ���� ��ü
		map.put("Ȳ����", 93);
		System.out.println("�� Entry ��: " + map.size());//�� Entry �� ���
		
		//��ü ã��		
		System.out.println("\t����� : " + map.get("�����"));//Ű�� �� �˻�
		System.out.println();
		
		//keySet() �޼���� Map �÷����� Ű�� �̾� Set �÷������� ���� 
		Set<String> keySet = map.keySet();
		//keySet �÷����� Iterator ��ü�� ��ȯ�Ͽ� �ݺ� ó��(��ü�� �ϳ��� ó��)
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {//�ݺ��ؼ� Ű�� ��� ���� Map���� ��
		  String key = keyIterator.next();//Ű�� �ϳ� ������
		  Integer value = map.get(key);//������ Ű�� ���� ������
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
		//��ü ����
		map.remove("�����");
		System.out.println("�� Entry ��: " + map.size());
		
		//entrySet() �޼����  ��� Map.entry ��ü�� �̾� Set �÷������� ���� 
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//entrySet �÷����� Iterator ��ü�� ��ȯ�Ͽ� �ݺ� ó��(��ü�� �ϳ��� ó��)
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {//�ݺ��ؼ� Map.entry�� ��� Ű�� ���� Map���� ��
		  //Map.Entry ��ü�� �ϳ��� ������	
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();//entry ��ü���� Ű�� ������
		  Integer value = entry.getValue();//entry ��ü���� ���� ������
		  System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//Map ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}
}
