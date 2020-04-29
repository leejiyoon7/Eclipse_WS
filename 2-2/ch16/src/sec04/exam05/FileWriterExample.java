package sec04.exam05;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		//파일 객체 생성
		File file = new File("C:/Temp/file.txt");	
		//FileWriter 객체 생성
		FileWriter fw = new FileWriter(file, true);	
		
		//텍스트 파일에 문자 데이터를 저장
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("파일에 저장되었습니다.");
	}
}

