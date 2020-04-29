package sec02.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//����Ʈ ��� ���� �Է� ��Ʈ�� ����(��ü)
		InputStream is = new FileInputStream(path+"/src/sec02/exam01/test.txt");
		
		int readByteNo;//���� ����Ʈ ���� ������ ����		
		//�����͸� ������ byte �迭 ����(ũ��:3)
		byte[] readBytes = new byte[3];
		String data = "";//���� ����Ʈ �����͸� ���ڿ��� ������ ����
		
		while( true ) {
			readByteNo = is.read(readBytes);//3��Ʈ�� �о� readBytes �迭�� ����
			if(readByteNo == -1) break;//���� �����Ͱ� ������ 
			//readBytes �迭�� ����� ����Ʈ �����͸� ���ڿ��� ����(����Ʈ�迭, �����ε���, ���� ����)
			data += new String(readBytes, 0, readByteNo);
		}
		
		System.out.println(data);
		
		is.close();//�Է� ��Ʈ�� �ݱ�
	}
}
