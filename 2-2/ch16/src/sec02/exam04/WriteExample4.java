package sec02.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//���� ��� ���� ��� ��Ʈ�� ����(��ü)
		Writer writer = new FileWriter(path+"/src/sec02/exam04/output4.txt");

		String data = "�ȳ� �ڹ� ���α׷�";
		writer.write(data);
		//writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();
	}
}
