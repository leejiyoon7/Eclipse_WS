package sec05.exam08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//FileOutputStream 객체 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		//ObjectOutputStream 연결
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		
		//객체 출력
		oos.writeObject(new Integer(10));//Integer 객체 출력
		oos.writeObject(new Double(3.14));//Double 출력
		oos.writeObject(new int[] { 1, 2, 3 });//배열 출력
		oos.writeObject(new String(" 손흥민"));//String 출력
		
		oos.flush();	oos.close(); fos.close();
		
		//객체 읽기
		//FileInputStream 객체 생성
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		// ObjectInputStream 연결
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//저장 순서에 맞춰 읽어야 함
		//readObject()의 리턴 타입이 Object이기 때문에 타입 변환해야 함
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
