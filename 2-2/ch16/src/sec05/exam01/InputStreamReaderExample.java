package sec05.exam01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		//콘솔로부터 InputStream 얻기
		InputStream is = System.in;
		//InputStream을 Reader로 변환(바이트 --> 문자)
		Reader reader = new InputStreamReader(is);	
		
		int readCharNo;//읽은 문자 수 저장
		
		char[] cbuf = new char[100];//읽은 데이터를 저장
		
		while ((readCharNo=reader.read(cbuf)) != -1) {
			//배열에서 문자열 결합
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);//문자열 출력
		}
		
		reader.close();
		is.close();
	}
}

