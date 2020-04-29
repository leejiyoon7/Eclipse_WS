package sec05.exam05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		//현재 폴더 경로 가져오기
		String path = System.getProperty("user.dir");
		// 스트림 변수 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;//읽은 데이터를 저장할 변수
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream(path + "/src/sec05/exam05/forest.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");				
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); 	bis.close();  fis.close();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		
		fis = new FileInputStream(path + "/src/sec05/exam05/forest.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");		
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); 	bis.close(); fis.close();
		System.out.println("사용했을 때: " + (end-start) + "ms");
	}
}

