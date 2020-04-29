package sec02.exam03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//문자 기반 파일 입력 스트림 생성(객체)
		Reader reader = new FileReader(path+"/src/sec02/exam03/test.txt");
		
		int readCharNo;
		
		//길이 2인 배열 생성
		char[] cbuf = new char[2];
		String data = "";
		
		while( true ) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			//cbuf 배열에 저장된 문자 데이터를 문자열로 저장(배열, 시작인덱스, 길이)
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();	
	}
}
