package sec02.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//���� ��� ���� ��� ��Ʈ�� ����(��ü)
		Writer writer = new FileWriter(path+"/src/sec02/exam04/output2.txt");
		
		char[] data = "�ڹ����α׷���".toCharArray();
		
		writer.write(data);//�迭�� ��� ���ڿ� ���

		writer.flush();
		writer.close();
	}
}
