package sec02.exam03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//���� ��� ���� �Է� ��Ʈ�� ����(��ü)
		Reader reader = new FileReader(path+"/src/sec02/exam03/test.txt");

		int readCharNo;
		char[] cbuf = new char[4];//�迭 ����
		
		readCharNo = reader.read(cbuf, 1, 2);
		
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	
	}
}
