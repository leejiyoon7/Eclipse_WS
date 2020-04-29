package sec02.exam02;

import java.io.FileInputStream;
import java.io.IOException;

//try-with-resources �������� ���ҽ� �ڵ� �ݱ�(�ڹ� 7��������)
public class FIleInputStreemExample2 {
	public static void main(String[] args) {
		// ���� Ŭ������ ���� ��� ��������
		String path= FIleInputStreemExample2.class.getResource("").getPath();
		
		/* ���ҽ��� try()�ȿ� ����, ";"�����ڷ� ���� ���� ���ҽ� ���� ���� 
		      ���ҽ��� java.lang.AutoCloseable �������̽� �����ϰ� �־�� ���� ����
		 */
		try(FileInputStream in = new FileInputStream(path + "/java.txt"); ) {			
			//���� �����͸� ����Ʈ ������ ������ ����
			int data = 0;
			
			//while()������ ������ �� ����Ʈ�� read�Ͽ� data ������ �����ϰ�, �̸� ���
			while((data=in.read()) != -1) {//-1:end of file
				System.out.write(data);
			}
		} catch (IOException e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�." + e);
		} finally {
			System.out.println();
			System.out.println("FileInputStream�� �ڵ����� close�Ǿ����ϴ�.");		
		}		
	}
}
