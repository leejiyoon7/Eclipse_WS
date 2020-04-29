package sec02.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FIleInputStreemExample {
	public static void main(String[] args) {
		
		//FileInputStream ��ü �ʱ�ȭ
		FileInputStream in = null;		
		// ���� Ŭ������ ���� ��� ��������
		String path= FIleInputStreemExample.class.getResource("").getPath();
		
		try {
			//���� �������� : ������ + "/���ϸ�"
			File file = new File(path + "/java.txt");
			
			//���Ͽ��� �����͸� �о� �� FileInputStream ��ü ����
			in = new FileInputStream(file);
			
			//���� �����͸� ����Ʈ ������ ������ ����
			int data = 0;
			
			//while()������ ������ �� ����Ʈ�� read�Ͽ� data ������ �����ϰ�, �̸� ���
			while((data=in.read()) != -1) {//-1:end of file
				System.out.write(data);
			}
		} catch (IOException e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�." + e);
		} finally {
			try {
				if(in != null) {
					in.close();//���ҽ��� �ݴ´�.
				}
				System.out.println();
			} catch (Exception e) {
				System.out.println("���� close �������� ���ܰ� �߻��Ͽ����ϴ�." + e);
			}			
		}		
	}
}

