package sec02.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		//���� ���� ��� ��������
		String path = System.getProperty("user.dir");
		//���� ��� ���� ��� ��Ʈ�� ����(��ü)
		Writer writer = new FileWriter(path+"/src/sec02/exam04/output.txt");
		
		char[] data = "�ڹ����α׷���".toCharArray();
		
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);//�� ���ھ� ���
		}
		writer.flush();
		writer.close();
	}
}
