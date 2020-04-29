package sec05.exam08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String[] args) throws Exception {
		//FileOutputStream 객체 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		//ObjectOutputStream 연결
		ObjectOutputStream oos = new ObjectOutputStream(fos);	
		
		//classA 객체 생성 및 필드값 할당
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;//classB의 filed1
		classA.field3 = 3;
		classA.field4 = 4;
		
		//classA 객체 출력
		oos.writeObject(classA);
		oos.flush();	oos.close(); fos.close();	
		
		//저장된 객체를 읽기(복원)
		//FileInputStream 객체 생성
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		//ObjectInputStream 연결
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//ClassA 타입의 객체가 저장되어 있기 때문에 readObject()의 리턴 타입(Object 타입)을 강제 변환
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);//직렬화가 안된 필드는 기본값으로 할당됨
	}
}
