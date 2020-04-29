package sec01.exam04;

public class BoxingMethodExample {
	public static void main(String[] args) {
		//Util Ŭ������ ���� boxing()�޼��带 ȣ���Ͽ� ���ϰ��� Box<Integer>Ÿ�� ���� box1�� ����
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println("intValue:" + intValue);
		
		/* Util Ŭ������ ���� boxing()�޼��带 ȣ���� ��, ��ü���� Ÿ���� �������� ������
		      �����Ϸ��¸Ű��������� ���� �߷��Ͽ� StringŸ������ ����
		   - ���ϰ��� Box<String>Ÿ�� ���� box2�� ����
		*/
		Box<String> box2 = Util.boxing("�����");
		String strValue = box2.get();
		System.out.println("strValue:" + strValue);
	}
}
