package sec02.exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FIleInputStreemExample {
	public static void main(String[] args) {
		
		//FileInputStream 객체 초기화
		FileInputStream in = null;		
		// 현재 클래스의 절대 경로 가져오기
		String path= FIleInputStreemExample.class.getResource("").getPath();
		
		try {
			//읽을 파일지정 : 절대경로 + "/파일명"
			File file = new File(path + "/java.txt");
			
			//파일에서 데이터를 읽어 올 FileInputStream 객체 생성
			in = new FileInputStream(file);
			
			//읽은 데이터를 바이트 단위로 저장할 변수
			int data = 0;
			
			//while()문으로 파일을 한 바이트씩 read하여 data 변수에 저장하고, 이를 출력
			while((data=in.read()) != -1) {//-1:end of file
				System.out.write(data);
			}
		} catch (IOException e) {
			System.out.println("예외가 발생하였습니다." + e);
		} finally {
			try {
				if(in != null) {
					in.close();//리소스를 닫는다.
				}
				System.out.println();
			} catch (Exception e) {
				System.out.println("파일 close 과정에서 예외가 발생하였습니다." + e);
			}			
		}		
	}
}

