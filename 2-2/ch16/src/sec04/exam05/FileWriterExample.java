package sec04.exam05;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		//���� ��ü ����
		File file = new File("C:/Temp/file.txt");	
		//FileWriter ��ü ����
		FileWriter fw = new FileWriter(file, true);	
		
		//�ؽ�Ʈ ���Ͽ� ���� �����͸� ����
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}

