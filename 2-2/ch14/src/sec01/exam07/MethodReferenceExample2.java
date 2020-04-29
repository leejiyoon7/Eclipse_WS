package sec01.exam07;

//�Լ��� �������̽� ����
interface StringFunc2 {
	String modify(String s);
}

public class MethodReferenceExample2 {
	/* �ν��Ͻ� �޼��� ����(method references)�� ���� �޼��� ����
	 * - �������̽��� �߻� �޼��带 �����ϴ� �޼��� ����(���ٽ��� ���๮�� �޼���� �ۼ�)
	 * - �޼����� ����Ÿ�԰� �Ű������� �Լ��� �������̽��� �߻� �޼���� �����ؾ� ��
	 */
	public String func(String s) {
		String result = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == ',')
				result += " ";
			else
				result += c;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		
		//MethodReferenceExample2 ��ü ����
		MethodReferenceExample2 obj = new MethodReferenceExample2();
		
		System.out.println("[�ν��Ͻ� �޼��� ����]");
		
		/* �ν��Ͻ� �޼��� ������ �������̽��� �͸� ���� ��ü ����
		 * ���� : �������̽� ���� = ����������::�޼����; */
		StringFunc2 sf2 = obj::func;	
		
		String result = sf2.modify(str);
		System.out.println(result);
	}
}

