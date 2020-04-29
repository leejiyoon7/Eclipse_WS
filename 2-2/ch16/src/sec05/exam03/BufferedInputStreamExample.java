package sec05.exam03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//BufferedInputStream ���� ��Ʈ���� ����� ���� ������� ���� ��� ó���ð� ��
public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");		
		//�ð� ���� ����
		long start = 0;	long end = 0;
		
		//����Ʈ ��� ���� �Է� ��Ʈ�� ����(��ü)
		FileInputStream fis1 = new FileInputStream(path + "/src/sec05/exam03/forest.jpg");
		//[���-1] BufferedInputStream ���� ��Ʈ�� �� ���
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}//�а� �������� ����
		end = System.currentTimeMillis();
		System.out.println("������� �ʾ��� ��: " + (end-start) + "ms");
		fis1.close();
		
		//[���-2] BufferedInputStream ���� ��Ʈ�� ���
		FileInputStream fis2 = new FileInputStream(path + "/src/sec05/exam03/forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}//�а� �������� ����
		end = System.currentTimeMillis();
		System.out.println("������� ��: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}

