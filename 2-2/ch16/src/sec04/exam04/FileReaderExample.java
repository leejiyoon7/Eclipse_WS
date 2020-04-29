package sec04.exam04;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");		
		//���� ��� ���� �Է� ��Ʈ�� ����(��ü)
		FileReader fr = new FileReader(path + "/src/sec04/exam04/FileReaderExample.java");
		
		int readCharNo;//���� ���� ��
		char[] cbuf = new char[100];//���ڸ� ������ �迭
		
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);//�ֿܼ� ���
		}
		
		fr.close();
	}
}

