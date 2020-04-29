package sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		//바이트 기반 파일 출력 스트림 생성(객체)
		OutputStream os = new FileOutputStream(path+"/src/sec02/exam02/output.txt");
		
		//"ABCDE"문자열에서 바이트 배열을 얻어냄
		byte[] data = "ABCDE".getBytes();
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);//1바이트씩 출력
		}
		os.flush();//출력 버퍼에 잔류하는 모든 바이트 출력
		os.close();//출력 스트림 닫기
	}

}
