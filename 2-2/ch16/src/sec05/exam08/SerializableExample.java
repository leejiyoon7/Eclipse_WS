package sec05.exam08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String[] args) throws Exception {
		//FileOutputStream ��ü ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		//ObjectOutputStream ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);	
		
		//classA ��ü ���� �� �ʵ尪 �Ҵ�
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;//classB�� filed1
		classA.field3 = 3;
		classA.field4 = 4;
		
		//classA ��ü ���
		oos.writeObject(classA);
		oos.flush();	oos.close(); fos.close();	
		
		//����� ��ü�� �б�(����)
		//FileInputStream ��ü ����
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		//ObjectInputStream ����
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//ClassA Ÿ���� ��ü�� ����Ǿ� �ֱ� ������ readObject()�� ���� Ÿ��(Object Ÿ��)�� ���� ��ȯ
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);//����ȭ�� �ȵ� �ʵ�� �⺻������ �Ҵ��
	}
}
