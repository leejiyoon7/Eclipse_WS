package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		// InputStream�� Reader�� ��ȯ�ϰ�, ������Ʈ���� BufferedReader�� ����
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);

		while(true) {
			System.out.print("�Է��ϼ���: ");
			String lineStr = br.readLine();//���� ������ ���ڿ� �б�
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				System.out.println("�۾��� �����մϴ�.");
				break;
			}
			System.out.print("�Էµȳ���: " + lineStr);
			System.out.println();
		}
		
		br.close();//�Է½�Ʈ�� �ݱ�
	}
}
