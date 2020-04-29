package sec05.exam04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//라인 단위 입력 처리
public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {	
		//InputStream 얻기
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);//Reader 연결			
		BufferedReader br = new BufferedReader(reader);//BufferedReader 연결
		
		System.out.print("입력: ");
		String lineString = br.readLine();//라인 단위 입력
		
		System.out.println("출력: " + lineString);	
	}
}
