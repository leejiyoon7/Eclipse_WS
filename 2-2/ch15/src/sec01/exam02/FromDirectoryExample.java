package sec01.exam02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) throws IOException {
		String dirPath = "D:/lecture/2019-2/java/workspace/ch15/src/sec01/exam02";
		//path 객체 얻기
		Path path = Paths.get(dirPath);
		//Files.list(path): path의 디렉토릭에 있는 파일및디텍토리를 요소로 갖는 스트림을 가져옴
		Stream<Path> stream = Files.list(path);
		stream.forEach( (p) -> System.out.println(p.getFileName()) );
	}
}

