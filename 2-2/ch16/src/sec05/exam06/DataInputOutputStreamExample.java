package sec05.exam06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//FileOutputStream ��ü ����(����Ʈ ��� ��� ��Ʈ��)
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		//DataOutputStream ���� ��Ʈ�� ����
		DataOutputStream dos = new DataOutputStream(fos);
		
		//����Ʈ ������ ����
		dos.writeUTF("�����");//���ڿ� ����
		dos.writeDouble(95.5);//Double �� ����
		dos.writeInt(1);//Int �� ����
		
		dos.writeUTF("�̰���");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		//������ �б�
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			//����� ������ ���� �о�� ��
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close(); fis.close();
	}
}

