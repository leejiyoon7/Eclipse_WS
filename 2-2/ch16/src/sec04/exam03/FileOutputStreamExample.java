package sec04.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");		
		String originalFileName = path + "/src/sec04/exam03/house.jpg";
		String targetFileName = "C:/Temp/house.jpg";
		
		//����Ʈ ��� ���� �Է� ��Ʈ�� ����(��ü)
		FileInputStream fis = new FileInputStream(originalFileName);
		//����Ʈ ��� ���� ��� ��Ʈ�� ����(��ü)
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;//���� ����Ʈ�� ���� ����
		
		//���� ����Ʈ �����͸� ������ readBytes �迭 ����
		byte[] readBytes = new byte[100];
		
		while((readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);//����(����迭, ����, ����)
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("���簡 �� �Ǿ����ϴ�.");
	}
}

