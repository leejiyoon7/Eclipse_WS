package sec05.exam04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//���� ���� �Է� ó��
public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {	
		//InputStream ���
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);//Reader ����			
		BufferedReader br = new BufferedReader(reader);//BufferedReader ����
		
		System.out.print("�Է�: ");
		String lineString = br.readLine();//���� ���� �Է�
		
		System.out.println("���: " + lineString);	
	}
}
