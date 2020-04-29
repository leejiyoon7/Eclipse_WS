package sec04.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");		
		String originalFileName = path + "/src/sec04/exam03/house.jpg";
		String targetFileName = "C:/Temp/house.jpg";
		
		//바이트 기반 파일 입력 스트림 생성(객체)
		FileInputStream fis = new FileInputStream(originalFileName);
		//바이트 기반 파일 출력 스트림 생성(객체)
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;//읽을 바이트수 저장 변수
		
		//읽은 바이트 데이터를 저장할 readBytes 배열 생성
		byte[] readBytes = new byte[100];
		
		while((readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);//저장(저장배열, 시작, 길이)
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}

