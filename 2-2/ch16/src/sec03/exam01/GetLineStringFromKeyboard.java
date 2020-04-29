package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		// InputStream을 Reader로 변환하고, 보조스트림인 BufferedReader를 연결
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);

		while(true) {
			System.out.print("입력하세요: ");
			String lineStr = br.readLine();//라인 단위로 문자열 읽기
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				System.out.println("작업을 종료합니다.");
				break;
			}
			System.out.print("입력된내용: " + lineStr);
			System.out.println();
		}
		
		br.close();//입력스트림 닫기
	}
}
