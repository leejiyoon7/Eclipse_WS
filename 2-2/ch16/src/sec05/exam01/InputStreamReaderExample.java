package sec05.exam01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		//�ַܼκ��� InputStream ���
		InputStream is = System.in;
		//InputStream�� Reader�� ��ȯ(����Ʈ --> ����)
		Reader reader = new InputStreamReader(is);	
		
		int readCharNo;//���� ���� �� ����
		
		char[] cbuf = new char[100];//���� �����͸� ����
		
		while ((readCharNo=reader.read(cbuf)) != -1) {
			//�迭���� ���ڿ� ����
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);//���ڿ� ���
		}
		
		reader.close();
		is.close();
	}
}

