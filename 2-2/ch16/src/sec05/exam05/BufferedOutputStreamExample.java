package sec05.exam05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		// ��Ʈ�� ���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;//���� �����͸� ������ ����
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream(path + "/src/sec05/exam05/forest.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");				
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); 	bis.close();  fis.close();
		System.out.println("������� �ʾ��� ��: " + (end-start) + "ms");
		
		fis = new FileInputStream(path + "/src/sec05/exam05/forest.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");		
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); 	bis.close(); fis.close();
		System.out.println("������� ��: " + (end-start) + "ms");
	}
}

