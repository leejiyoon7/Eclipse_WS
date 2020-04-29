package sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//����Ʈ ��� ���� ��� ��Ʈ�� ����(��ü)
		OutputStream os = new FileOutputStream(path+"/src/sec02/exam02/output.txt");
		
		//���ڿ����� ����Ʈ �迭�� ��
		byte[] data = "Java programming".getBytes();
		
		os.write(data);//����Ʈ�迭(data)�� ��� ����Ʈ ���
		os.flush();//��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ ���
		os.close();//��� ��Ʈ�� �ݱ�
	}
}
