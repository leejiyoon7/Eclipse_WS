package sec02.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//문자 기반 파일 출력 스트림 생성(객체)
		Writer writer = new FileWriter(path+"/src/sec02/exam04/output.txt");
		
		char[] data = "자바프로그래밍".toCharArray();
		
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);//한 문자씩 출력
		}
		writer.flush();
		writer.close();
	}
}
