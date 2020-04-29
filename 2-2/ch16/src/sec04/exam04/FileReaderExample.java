package sec04.exam04;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");		
		//문자 기반 파일 입력 스트림 생성(객체)
		FileReader fr = new FileReader(path + "/src/sec04/exam04/FileReaderExample.java");
		
		int readCharNo;//읽은 문자 수
		char[] cbuf = new char[100];//문자를 저장할 배열
		
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);//콘솔에 출력
		}
		
		fr.close();
	}
}

