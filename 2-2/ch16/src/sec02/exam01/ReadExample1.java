package sec02.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//바이트 기반 파일 입력 스트림 생성(객체)
		InputStream is = new FileInputStream(path+"/src/sec02/exam01/test.txt");
		int readByte;//읽은 바이트를 저장할 변수
		
		//파일 읽기
		while(true) {
			readByte = is.read();//1바트씩 읽기
			if(readByte == -1) break;//읽을 것이 없으면
			System.out.println((char)readByte);
		}
		is.close();//파일 입력 스트림 close
	}
}
