package sec01.exam07;

//�Լ��� �������̽� ����
interface StringFunc {
	String modify(String s);
}

public class MethodReferenceExample {
	/* static �޼��� ����(method references)�� ���� �޼��� ����
	 * - �������̽��� �߻� �޼��带 �����ϴ� �޼��� ����(���ٽ��� ���๮�� �޼���� �ۼ�)
	 * - �޼����� ����Ÿ�԰� �Ű������� �Լ��� �������̽��� �߻� �޼���� �����ؾ� ��
	 */
	static String func(String s) {
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
		
		//StringFunc �������̽��� �����ϴ� ���ٽ� 
		StringFunc sf = (s) -> {
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
		};		
		
		String result;
		
		System.out.println("[���ٽ� ���]");		
		result = sf.modify(str);
		System.out.println(result);	
		
		System.out.println("[static �޼��� ���� ���]");
		
		/* static �޼��� ������ �������̽��� �͸� ���� ��ü ����
		 * ���� : �������̽� ���� = Ŭ������::�޼����; */
		StringFunc sf2 = MethodReferenceExample::func;		
		result = sf2.modify(str);
		System.out.println(result);
	}
}
