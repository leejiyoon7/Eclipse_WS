package sec02.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//����Ʈ ��� ���� �Է� ��Ʈ�� ����(��ü)
		InputStream is = new FileInputStream(path+"/src/sec02/exam01/test.txt");				
		int readByteNo;//���� ����Ʈ ���� ������ ����		
		//�����͸� ������ byte �迭 ����(ũ��:5)
		byte[] readBytes = new byte[8];
		//�Է½�Ʈ�����κ��� 3����Ʈ�� �а�, readBytes[2]~[4]�� ����
		readByteNo = is.read(readBytes, 2, 3);
		
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		//�Է½�Ʈ�� �ݱ�
		is.close();
	}
}
