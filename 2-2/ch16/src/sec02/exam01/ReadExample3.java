package sec02.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//바이트 기반 파일 입력 스트림 생성(객체)
		InputStream is = new FileInputStream(path+"/src/sec02/exam01/test.txt");				
		int readByteNo;//읽은 바이트 수를 저장할 변수		
		//데이터를 저장할 byte 배열 생성(크기:5)
		byte[] readBytes = new byte[8];
		//입력스트림으로부터 3바이트를 읽고, readBytes[2]~[4]에 저장
		readByteNo = is.read(readBytes, 2, 3);
		
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		//입력스트림 닫기
		is.close();
	}
}
