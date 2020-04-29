package sec02.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//����Ʈ ��� ���� �Է� ��Ʈ�� ����(��ü)
		InputStream is = new FileInputStream(path+"/src/sec02/exam01/test.txt");
		int readByte;//���� ����Ʈ�� ������ ����
		
		//���� �б�
		while(true) {
			readByte = is.read();//1��Ʈ�� �б�
			if(readByte == -1) break;//���� ���� ������
			System.out.println((char)readByte);
		}
		is.close();//���� �Է� ��Ʈ�� close
	}
}
