package sec02.exam03;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//문자 기반 파일 입력 스트림 생성(객체)
		Reader reader = new FileReader(path+"/src/sec02/exam03/test.txt");

		int readCharNo;
		char[] cbuf = new char[4];//배열 생성
		
		readCharNo = reader.read(cbuf, 1, 2);
		
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	
	}
}
