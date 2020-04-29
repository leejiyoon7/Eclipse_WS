package sec01.exam04;

public class MyGenInterfaceExample {
	public static void main(String[] args) {	
		/* ���׸� �Լ��� �������̽��� �����ϴ� ���ٽ� ����
		 * Ÿ�� �Ű����� T�� ������ Ÿ�� �Ķ���ʹ� ���ٽ��� �����ϴ� ������ ����
		 */
		MyGenInterface<String> mgs = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mgs.getVlue("java"));
		System.out.println(mgs.getVlue("java programming"));

		MyGenInterface<Integer> mgi = (n) -> {return n * 2;};
		System.out.println(mgi.getVlue(100));
		System.out.println(mgi.getVlue(1000));
	}
}
