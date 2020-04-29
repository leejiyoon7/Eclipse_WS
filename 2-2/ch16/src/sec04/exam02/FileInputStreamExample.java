package sec04.exam02;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		try {
			//바이트 기반 파일 입력 스트림 생성(객체)
			FileInputStream fis = new FileInputStream(path+"/src/sec04/exam02/FileInputStreamExample.java");
			int data;//읽은 바이트 저장 변수
			//1 바이트씩 읽어서 콘솔에 출력
			while ( (data = fis.read() ) != -1 ) {
				System.out.write(data);//콘솔에 출력
			}
			fis.close();//입력 스트림 닫기	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

