package sec02.exam03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//���� ��� ���� �Է� ��Ʈ�� ����(��ü)
		Reader reader = new FileReader(path+"/src/sec02/exam03/test.txt");
		
		int readCharNo;
		
		//���� 2�� �迭 ����
		char[] cbuf = new char[2];
		String data = "";
		
		while( true ) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			//cbuf �迭�� ����� ���� �����͸� ���ڿ��� ����(�迭, �����ε���, ����)
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();	
	}
}
