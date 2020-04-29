package sec04.exam02;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		try {
			//����Ʈ ��� ���� �Է� ��Ʈ�� ����(��ü)
			FileInputStream fis = new FileInputStream(path+"/src/sec04/exam02/FileInputStreamExample.java");
			int data;//���� ����Ʈ ���� ����
			//1 ����Ʈ�� �о �ֿܼ� ���
			while ( (data = fis.read() ) != -1 ) {
				System.out.write(data);//�ֿܼ� ���
			}
			fis.close();//�Է� ��Ʈ�� �ݱ�	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

