package sec04.exam01;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		//���� ��ü ����
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		//�Ű������� URI ���·� �����Ͽ� ���� ��ü ����(��Ű��/ȣ��Ʈ��/���ϰ��)
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if(dir.exists() == false) {  dir.mkdirs();  }//C:/Temp/Dir�� ������ ����
		if(file1.exists() == false) {  file1.createNewFile();  }//������ ������ ����
		if(file2.exists() == false) {  file2.createNewFile();  }//������ ������ ����
		if(file3.exists() == false) {  file3.createNewFile();  }//������ ������ ����

		//temp ���� ��ü ����
		File temp = new File("C:/Temp");
		//SimpleDateFormat ��ü ����(���� ����/���� �ð�)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		//temp ������ �ִ� ����(���� ���� ����)�� ���� ����� File ��ü�� ���� �迭�� ����
		File[] contents = temp.listFiles();
		
		System.out.println("��¥              �ð�         ����       ũ��    �̸�");
		System.out.println("--------------------------------------------------------");
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));//Last �����Ͻ�
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());//���丮�̸�
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
 			System.out.println();
		}
	}
}
