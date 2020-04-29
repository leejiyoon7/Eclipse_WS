package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("�λ�");
		list.add("����");
		list.add("����");

		System.out.println("==== �Ϲ� for ====");
		
		//�Ϲ� for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("===== ���� for ====");

		//���� for
		for (String city : list) {
			System.out.println(city);
		}

		System.out.println("===== iterator =====");
		
		/* iterator() �޼���� �÷��� ��ü�� Iterator ��ü�� ��ȯ�Ͽ� ��ȯ
		 * ��� List, Set �迭�� �÷��� ��ü�� Iterator ��ü�� ��ȯ�Ͽ� ��� ����  */
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {//���� Ŀ�� ������ ��Ұ� �ִ��� �Ǵ�
			System.out.println(iter.next());//Ŀ�� ���� ��Ҹ� ��ȯ�ϰ�, Ŀ���� ���� ��ҷ� �̵�
		}
		
		System.out.println("==== forEach =====");
		
		/* Java 8�� ���ٰ� ���Ե��鼭 ���� ū ������ ���� ������ API�� �ݷ���(Collection)�̴�. 
		 * Collection�� �߰��� forEach()�� stream()�� ���ٹ������ ���� ������� ó���ϱ� ���� ������� API�̴�.
		 * ������ List,Map,Set��� forEach API�� ���ٸ� �Ķ���Ͱ����� �޴´�.  
		 * ���ٽ� �ȿ����� �� ������Ʈ�� ���� ���� ó���� �����Ѵ�.
		 */
		
		list.forEach((city) -> {
			System.out.println(city);
		});
		
		/* forEach �����ݷ� ������
		 * �ڹ�8���� �߰��� �޼��� ����(Method Reference) ������
		 * �޼��� ������ ���ٽİ� ������ ���ٽİ� ������ ó�� ����� ���� ǥ����������
		 * ���� ����(body)�� �����ϴ� ���, �̸����� ���� �޼��带 ������
		 * �޼��� ���� ���� : Ÿ�� ������ü(Ÿ�� ���۷���)::�޼����̸�
		 * Computer::getAge;// Computer��� Ŭ������ ���ǵ� getAge �޼ҵ忡 ���� Method Reference
		 * System.out �������� println �޼��忡 �Ķ���ͷ� list���� ���� �ϳ��� �����Ͽ� ���
		 */
		list.forEach(System.out::println);
		
		//list.forEach(city -> System.out.println(city) );
		
		System.out.println("==== map =====");
		//map
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "�����");
		namesMap.put(2, "�̰���");
		namesMap.put(3, "Ȳ����");
		
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		
		System.out.println("==== map =====");
		//entrySet(): key�� value�� ������ ������ ��� map.entry ��ü�� set��ü�� ��� ����
		namesMap.entrySet().forEach(entry -> System.out.println(
				  entry.getKey() + " " + entry.getValue()));
	}
}
