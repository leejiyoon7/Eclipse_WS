package sec03.exam01;

import java.io.InputStream;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {		
		System.out.println("== �޴� ==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.print("�޴��� �����ϼ���: ");
		
		//�ַܼκ��� �Է¹ޱ� ���� System.in�� InputStream�� �Ҵ�
		InputStream is = System.in;
		char inputChar = (char) is.read();//���� 1����Ʈ(�ƽ�ũ �ڵ�)�� ���ڷ� ��ȯ			
		switch(inputChar) {
			case '1':
				System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
				break;
			case '2':
				System.out.println("���� ��ݸ� �����ϼ̽��ϴ�.");
				break;
			case '3':
				System.out.println("���� �Աݸ� �����ϼ̽��ϴ�.");
				break;
			case '4':
				System.out.println("���� �ϱ⸦ �����ϼ̽��ϴ�.");
				break;
		}			
	}
}
