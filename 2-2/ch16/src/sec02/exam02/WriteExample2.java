package sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//바이트 기반 파일 출력 스트림 생성(객체)
		OutputStream os = new FileOutputStream(path+"/src/sec02/exam02/output.txt");
		
		//문자열에서 바이트 배열을 얻어냄
		byte[] data = "Java programming".getBytes();
		
		os.write(data);//바이트배열(data)의 모든 바이트 출력
		os.flush();//출력 버퍼에 잔류하는 모든 바이트 출력
		os.close();//출력 스트림 닫기
	}
}
