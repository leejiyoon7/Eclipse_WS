package sec01.exam05;

public class CompareMethodExample {
	public static void main(String[] args) {
		//Pair ��ü ����
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		
		//Util.<>compare()�޼��带 ȣ���Ͽ� ��
		boolean isRresult1 = Util.<Integer, String>compare(p1, p2);
		
		if(isRresult1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
		
		//Pair ��ü ����
		Pair<String, String> p3 = new Pair<String, String>("user1", "�����");
		Pair<String, String> p4 = new Pair<String, String>("user2", "�����");
		
		/* Util.compare()�޼��带 ȣ���Ͽ� ��
		 * - ��ü���� Ÿ���� �������� ������  �����Ϸ��¸Ű��������� ���� �߷��Ͽ� StringŸ������ ����
		 */
		boolean isRresult2 = Util.compare(p3, p4);
		
		if(isRresult2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
	}
}
