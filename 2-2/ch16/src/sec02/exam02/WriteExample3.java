package sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//����Ʈ ��� ���� ��� ��Ʈ�� ����(��ü)
		OutputStream os = new FileOutputStream(path+"/src/sec02/exam02/output3.txt");
		
		//���ڿ����� ����Ʈ �迭�� ��
		byte[] data = "Java programming".getBytes();
		os.write(data, 5, 11);
		os.flush();
		os.close();
	}
}
