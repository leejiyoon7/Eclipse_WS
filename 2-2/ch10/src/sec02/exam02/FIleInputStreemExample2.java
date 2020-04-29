package sec02.exam02;

import java.io.FileInputStream;
import java.io.IOException;

//try-with-resources 구문으로 리소스 자동 닫기(자바 7버전부터)
public class FIleInputStreemExample2 {
	public static void main(String[] args) {
		// 현재 클래스의 절대 경로 가져오기
		String path= FIleInputStreemExample2.class.getResource("").getPath();
		
		/* 리소스를 try()안에 선언, ";"구분자로 여러 개의 리소스 선언 가능 
		      리소스는 java.lang.AutoCloseable 인터페이스 구현하고 있어야 선언 가능
		 */
		try(FileInputStream in = new FileInputStream(path + "/java.txt"); ) {			
			//읽은 데이터를 바이트 단위로 저장할 변수
			int data = 0;
			
			//while()문으로 파일을 한 바이트씩 read하여 data 변수에 저장하고, 이를 출력
			while((data=in.read()) != -1) {//-1:end of file
				System.out.write(data);
			}
		} catch (IOException e) {
			System.out.println("예외가 발생하였습니다." + e);
		} finally {
			System.out.println();
			System.out.println("FileInputStream이 자동으로 close되었습니다.");		
		}		
	}
}
