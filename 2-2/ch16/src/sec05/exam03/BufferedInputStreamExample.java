package sec05.exam03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//BufferedInputStream 보조 스트림을 사용한 경우와 사용하지 않은 경우 처리시간 비교
public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");		
		//시간 저장 변수
		long start = 0;	long end = 0;
		
		//바이트 기반 파일 입력 스트림 생성(객체)
		FileInputStream fis1 = new FileInputStream(path + "/src/sec05/exam03/forest.jpg");
		//[방법-1] BufferedInputStream 보조 스트림 미 사용
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}//읽고 저장하지 않음
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();
		
		//[방법-2] BufferedInputStream 보조 스트림 사용
		FileInputStream fis2 = new FileInputStream(path + "/src/sec05/exam03/forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}//읽고 저장하지 않음
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}

