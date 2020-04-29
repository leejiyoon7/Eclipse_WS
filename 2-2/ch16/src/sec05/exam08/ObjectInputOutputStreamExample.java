package sec05.exam08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//FileOutputStream ��ü ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		//ObjectOutputStream ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		
		//��ü ���
		oos.writeObject(new Integer(10));//Integer ��ü ���
		oos.writeObject(new Double(3.14));//Double ���
		oos.writeObject(new int[] { 1, 2, 3 });//�迭 ���
		oos.writeObject(new String(" �����"));//String ���
		
		oos.flush();	oos.close(); fos.close();
		
		//��ü �б�
		//FileInputStream ��ü ����
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		// ObjectInputStream ����
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//���� ������ ���� �о�� ��
		//readObject()�� ���� Ÿ���� Object�̱� ������ Ÿ�� ��ȯ�ؾ� ��
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
	}
}
