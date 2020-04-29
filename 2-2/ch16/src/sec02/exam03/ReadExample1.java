package sec02.exam03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//���� ��� ���� �Է� ��Ʈ�� ����(��ü)
		Reader reader = new FileReader(path+"/src/sec02/exam03/test.txt");
		int readData;
		while( true ) {
			readData = reader.read();//�� ���ھ� �о� readData�� ����
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		
		reader.close();//�Է� ��Ʈ�� �ݱ�
	
	}
}
