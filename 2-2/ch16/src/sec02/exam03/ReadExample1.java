package sec02.exam03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//문자 기반 파일 입력 스트림 생성(객체)
		Reader reader = new FileReader(path+"/src/sec02/exam03/test.txt");
		int readData;
		while( true ) {
			readData = reader.read();//한 문자씩 읽어 readData에 저장
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		
		reader.close();//입력 스트림 닫기
	
	}
}
