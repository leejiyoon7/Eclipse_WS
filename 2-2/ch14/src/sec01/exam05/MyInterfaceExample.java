package sec01.exam05;

public class MyInterfaceExample {
	static String compare(MyInterface mi, String s) {
		/* �Ű������� ���޹��� ���ٽ��� getValue()�޼��� ȣ��
		 * ȣ���� �� �ι�° �Ű������� ���� ���ڿ� s�� ����
		 * ���ٽ��� ������ �� ��ȯ���� ���� �ٽ� ��ȯ */
		return mi.getValue(s);
	}
	
	public static void main(String[] args) {
		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		
		//MyInterface �����ϴ� ���ٽ� 
		MyInterface mi1 = (s) -> {
			String result = "";
			char c;
			//�Ű����� s�� ���޹��� ���ڿ��� ���̸�ŭ �ݺ�
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);//s���� i��°�� ���ڸ� ��ȯ
				if (c == ',')
					result += " ";
				else
					result += c;
			}
			return result;
		};
		
		// compare()�޼��� ȣ��(�Ű������� ���ٽİ� ���ڿ� ����)
		String s1 = compare(mi1, str);
		System.out.println(s1);

		/* compare()�޼��� ȣ��(�Ű������� ���ٽİ� ���ڿ� ����) 
		 * �������̽� ������ ������� �ʰ� ���ٽ� �ڵ带 �Ű������� ���� ����
		 */
		String s2 = compare((s) -> {
			int max = 0;
			int index = 0;
			//","�� �������� s ���ڿ��� ���� �� word �迭�� ����
			String[] word = s.split(",");
			//word �迭�� ����� �ܾ� ������ŭ �ݺ�(���� ��ܾ ã�� �ش����� �ε������� index�� ����)
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];//word �迭���� index��° ���� ����
		}, str);
		System.out.println(s2);
	}
}
