package sec01.exam08;

/* ���׸� �Լ��� �������̽� ����
 * Ÿ�� �Ķ���͸� ���� T�� ����  */
interface MyFunc<T> {
	int func(T[] arr, T val);
}

// MyUtil Ŭ���� ����
class MyUtil {
	/* ���׸� �޼��� ����(method references)�� ���� �޼��� ����
	 * ���׸� �Լ��� �������̽��� �߻� �޼���(func())�� �����ϴ� �޼��� ����(���ٽ��� ���๮�� �޼���� �ۼ�)
	 * �޼����� ����Ÿ�԰� �Ű������� �Լ��� �������̽��� �߻� �޼���� �����ؾ� ��
	 * �Ű������� Ÿ�� �Ķ���� T�� ����(TŸ���� �迭�� T Ÿ���� ���� �Ű������� ����)
	 * �Ű������� ���� arr �迭���� val ���� �� �� �����ϴ��� ī��Ʈ�ϴ� �޼���
	 */
	static <T> int count(T[] arr, T val) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val)
				cnt++;
		}
		return cnt;
	}
}

public class MethodReferenceExample3 {
	/* ���ٽ����� ������ �Լ��� �������̽��� func() �޼��带 ȣ���ϱ� ���� ������ �޼���
	 * ù ��° ���ڴ� �Լ��� �������̽��� ���� ��ü, MyFunc �������̽��� �߻� �޼��带 �����ϴ� �޼��� ����(���ٽ��� ���๮�� �޼���� �ۼ�)
	 * - �޼����� ����Ÿ�԰� �Ű������� �Լ��� �������̽��� �߻� �޼���� �����ؾ� ��
	 */
	static <T> int test(MyFunc<T> mf, T[] arr, T val) {
		// mf.func()�޼��� ȣ��(�Ű������� arr, val ����)
		return mf.func(arr, val);
	}
	
	public static void main(String[] args) {
		String[] list1 = { "blue", "red", "yellow", "blue", "red", "blue" };
		Integer[] list2 = { 10, 50, 10, 50, 40, 10, 20, 10, 20 };

		int cnt = 0;
		
		/* MyUtil::<String>count: ���׸� �޼��带 ����Ͽ� ���� ��ü ����
		   - ���׸� �Լ��� �������̽�(MyFunc<T>)�� func() �޼��带 ������
		     MyUtil Ŭ������ <String>count() ���׸� �޼���� ���� ��ü ����
		 * list1: ���ڿ� �迭
		 * "blue": ã�� ���ڿ�
		 */
		cnt = test(MyUtil::<String>count, list1, "blue");
		System.out.println("���� : " + cnt);

		cnt = test(MyUtil::<Integer>count, list2, 10);
		System.out.println("���� : " + cnt);
	}
}
