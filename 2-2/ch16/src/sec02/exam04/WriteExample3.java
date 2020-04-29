package sec02.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//문자 기반 파일 출력 스트림 생성(객체)
		Writer writer = new FileWriter(path+"/src/sec02/exam04/output3.txt");
		
		char[] data = "자바프로그래밍".toCharArray();
		
		writer.write(data, 2, 5);//배열의 2번째 부터 5문자 출력 

		writer.flush();
		writer.close();
	}
}
