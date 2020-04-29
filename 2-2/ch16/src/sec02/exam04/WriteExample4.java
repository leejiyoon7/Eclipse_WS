package sec02.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//문자 기반 파일 출력 스트림 생성(객체)
		Writer writer = new FileWriter(path+"/src/sec02/exam04/output4.txt");

		String data = "안녕 자바 프로그램";
		writer.write(data);
		//writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();
	}
}
