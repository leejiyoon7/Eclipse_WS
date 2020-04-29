package sec01.exam02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) throws IOException {
		String dirPath = "D:/lecture/2019-2/java/workspace/ch15/src/sec01/exam02";
		//path ��ü ���
		Path path = Paths.get(dirPath);
		//Files.list(path): path�� ���丯�� �ִ� ���Ϲ׵����丮�� ��ҷ� ���� ��Ʈ���� ������
		Stream<Path> stream = Files.list(path);
		stream.forEach( (p) -> System.out.println(p.getFileName()) );
	}
}

