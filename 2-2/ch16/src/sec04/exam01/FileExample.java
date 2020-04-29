package sec04.exam01;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		//파일 객체 생성
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		//매개변수를 URI 형태로 지정하여 파일 객체 생성(스키마/호스트명/파일경로)
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if(dir.exists() == false) {  dir.mkdirs();  }//C:/Temp/Dir가 없으면 생성
		if(file1.exists() == false) {  file1.createNewFile();  }//파일이 없으면 생성
		if(file2.exists() == false) {  file2.createNewFile();  }//파일이 없으면 생성
		if(file3.exists() == false) {  file3.createNewFile();  }//파일이 없으면 생성

		//temp 파일 객체 생성
		File temp = new File("C:/Temp");
		//SimpleDateFormat 객체 생성(일자 오전/오후 시간)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		//temp 폴더에 있는 폴더(서브 폴더 포함)나 파일 목록을 File 객체로 만들어서 배열로 생성
		File[] contents = temp.listFiles();
		
		System.out.println("날짜              시간         형태       크기    이름");
		System.out.println("--------------------------------------------------------");
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));//Last 수정일시
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());//디렉토리이면
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
 			System.out.println();
		}
	}
}
