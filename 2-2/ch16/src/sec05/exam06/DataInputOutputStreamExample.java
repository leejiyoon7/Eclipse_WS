package sec05.exam06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//FileOutputStream 객체 생성(바이트 기반 출력 스트림)
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		//DataOutputStream 보조 스트림 연결
		DataOutputStream dos = new DataOutputStream(fos);
		
		//바이트 데이터 저장
		dos.writeUTF("손흥민");//문자열 저장
		dos.writeDouble(95.5);//Double 값 저장
		dos.writeInt(1);//Int 값 저장
		
		dos.writeUTF("이강인");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		//데이터 읽기
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			//저장된 순서에 맞줘 읽어야 함
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close(); fis.close();
	}
}

