package sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//����Ʈ ��� ���� ��� ��Ʈ�� ����(��ü)
		OutputStream os = new FileOutputStream(path+"/src/sec02/exam02/output.txt");
		
		//"ABCDE"���ڿ����� ����Ʈ �迭�� ��
		byte[] data = "ABCDE".getBytes();
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);//1����Ʈ�� ���
		}
		os.flush();//��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ ���
		os.close();//��� ��Ʈ�� �ݱ�
	}

}
