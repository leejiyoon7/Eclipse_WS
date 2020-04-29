package sec02.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//바이트 기반 파일 입력 스트림 생성(객체)
		InputStream is = new FileInputStream(path+"/src/sec02/exam01/test.txt");
		
		int readByteNo;//읽은 바이트 수를 저장할 변수		
		//데이터를 저장할 byte 배열 생성(크기:3)
		byte[] readBytes = new byte[3];
		String data = "";//읽은 바이트 데이터를 문자열로 저장할 변수
		
		while( true ) {
			readByteNo = is.read(readBytes);//3바트씩 읽어 readBytes 배열에 저장
			if(readByteNo == -1) break;//읽을 데이터가 없으면 
			//readBytes 배열에 저장된 바이트 데이터를 문자열로 저장(바이트배열, 시작인덱스, 읽을 길이)
			data += new String(readBytes, 0, readByteNo);
		}
		
		System.out.println(data);
		
		is.close();//입력 스트림 닫기
	}
}
