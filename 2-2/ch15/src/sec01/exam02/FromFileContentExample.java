package sec01.exam02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public static void main(String[] args) throws IOException {
		//Paths.get()�޼���� ���� ��� �������� 
		Path path = Paths.get("src/sec01/exam02/linedata.txt");
		//��ҷ� String�� �޴� ��Ʈ�� ���� ����
		Stream<String> stream;
		
		/* Files.lines() �޼ҵ带 �̿��Ͽ� ��Ʈ�� ��������(���1)
		 * ���Ͽ��� �� ������ �ؽ�Ʈ ������ ��ҷ� ������ ��Ʈ��
		 */
		stream = Files.lines(path, Charset.defaultCharset());
		//stream.forEach( (s) -> System.out.println(s) );
		stream.forEach( System.out :: println );//�޼��� ���۷��� ������ ������ü ����
		stream.close();
		System.out.println();
		
		//BufferedReader�� lines() �޼ҵ� �̿��Ͽ� ��Ʈ�� ��������(���2)
		File file = path.toFile();//���� ��ü ��� ����
		//���� ��ü�� ������ FileReader ��ü ����(���� ������ �д� ��Ʈ��) 
		FileReader fileReader = new FileReader(file); 
		//���۴����� ������ �б� ���� BufferedReader ��ü ����
		BufferedReader br = new BufferedReader(fileReader);		
		stream = br.lines();//BufferedReader�� lines() �޼���� ��Ʈ�� ���
		stream.forEach( System.out :: println );
		stream.close();//��Ʈ�� close
	}
}

