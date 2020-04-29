package sec01.exam02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public static void main(String[] args) throws IOException {
		//Paths.get()메서드로 파일 경로 가져오기 
		Path path = Paths.get("src/sec01/exam02/linedata.txt");
		//요소로 String을 받는 스트림 변수 선언
		Stream<String> stream;
		
		/* Files.lines() 메소드를 이용하여 스트림 가져오기(방법1)
		 * 파일에서 한 라인의 텍스트 정보를 요소로 가지는 스트림
		 */
		stream = Files.lines(path, Charset.defaultCharset());
		//stream.forEach( (s) -> System.out.println(s) );
		stream.forEach( System.out :: println );//메서드 레퍼런스 참조로 구현객체 생성
		stream.close();
		System.out.println();
		
		//BufferedReader의 lines() 메소드 이용하여 스트림 가져오기(방법2)
		File file = path.toFile();//파일 객체 얻어 오기
		//파일 객체를 가지고 FileReader 객체 생성(문자 파일을 읽는 스트림) 
		FileReader fileReader = new FileReader(file); 
		//버퍼단위로 파일을 읽기 위해 BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(fileReader);		
		stream = br.lines();//BufferedReader의 lines() 메서드로 스트림 얻기
		stream.forEach( System.out :: println );
		stream.close();//스트림 close
	}
}

