package sec02.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//���� ��� ���� ��� ��Ʈ�� ����(��ü)
		Writer writer = new FileWriter(path+"/src/sec02/exam04/output3.txt");
		
		char[] data = "�ڹ����α׷���".toCharArray();
		
		writer.write(data, 2, 5);//�迭�� 2��° ���� 5���� ��� 

		writer.flush();
		writer.close();
	}
}
