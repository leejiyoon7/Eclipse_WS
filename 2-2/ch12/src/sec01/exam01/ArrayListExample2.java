package sec01.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add("����");
		list.add("�θ�");
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		//ArrayList�� ��� �����͸� ���ڿ��� ��ȯ�Ͽ� ���
		System.out.println("1 : " + list.toString());

		list.add(1, "LA");
		print(2, list);

		/* �Ű������� ���޹��� ����� �ε����� ����
		   - int indexOf(Object o): �տ������� �˻��Ͽ� ó�� �˻��� �������� �ε��� ��ȯ
		   - int lastIndexOf(Object o): ���������� �˻��Ͽ� ó�� �˻��� �������� �ε��� ��ȯ
		 */
		System.out.println("3 : " + list.indexOf("����"));
		System.out.println("4 : " + list.lastIndexOf("����"));

		/* �Ű������� ���޹��� �����͸� ����(���� �� ������ �����Ͱ� �������� �̵�) 
		 * boolean remove(Object o)
		 */
		list.remove("LA");
		print(5, list);

		/* �Ű������� ���޹��� �ε����� �����͸� ����(���� �� ������ �����Ͱ� �������� �̵�) 
		 *  E remove(int index)
		 */
		list.remove(2);
		print(6, list);

		/* �Ű������� ������ �����Ͱ� list�� ���ԵǾ� �ִ��� �Ǵ�(true/false ��ȯ)
		 *  boolean contains(Object o)
		 */
		System.out.println("7 : " + list.contains("LA"));

		/* ArrayList�� �����͸� ���� Object Ÿ���� �迭�� �����Ͽ� ��ȯ
		 * Object[] toArray()
		 */
		Object obj[] = list.toArray();
		System.out.println("8 : " + Arrays.toString(obj));

		/*  ArrayList�� �����͸� ����  Object Ÿ���� �ƴ� Ư�� Ÿ����  �迭�� �����Ͽ� ��ȯ
		 * <T> T[] toArray(T[] a)
		 */
		String cities[] = new String[0];//StringŸ���� cities[] �迭 ����
		//�迭(cities)�� String Ÿ���̹Ƿ� list�� �����͸� String Ÿ���� �迭�� �������� ��ȯ
		cities = list.toArray(cities);
		System.out.println("9 : " + Arrays.toString(cities));

		/*  ArrayList�� ��� �����͸� ����
		 * void clear()
		 */
		list.clear();
		print(10, list);

		/* list�� ��� �ִ��� Ȯ��
		 * boolean isEmpty()
		 */
		System.out.println("11: " + list.isEmpty());

		//list�� ������ �߰�
		list.add("�ĸ�");
		list.add("����");
		list.add("LA");

		/* Arrays.asList() �޼���� ���ڷ� ���޵� �����͸� ������ List ��ü ����
		 *  Arrays Ŭ������ static <T> List<T> asList(T... a)
		 */
		List<String> list2 = Arrays.asList("����", "����", "����");
		print(12, list2);

		/* addAll() �޼����� ���ڷ� ���޵� �÷���(list2)�� ���� �÷���(list)�� �߰�
		 *  boolean addAll(Collection<? extends E> c)
		 */
		list.addAll(list2);
		print(13, list);

		/* containsAll() �޼���� list�� list2 �÷����� ������ ���ԵǾ� �ִ��� �Ǵ�(true/false)
		 * boolean containsAll(Collection<?> c)
		 */
		System.out.println("14: " + list.containsAll(list2));

		/* retainAll() �޼���� list���� list2 �÷����� �����͸� ���ܵΰ� ��� ����
		 * boolean retainAll(Collection<?> c)
		 */
		list.retainAll(list2);
		print(15, list);

		/* removeAll() �޼���� list���� list2 �÷����� ��� �����͸� ����
		 * boolean removeAll(Collection<?> c)
		 */
		list.removeAll(list2);
		print(16, list);
	}

	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list.toString());
		//System.out.println(n + " : " + list);
	}
}
