package sec01.exam01;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		//nameList 컬렉션
		List<String> nameList = Arrays.asList("손흥민", "이강인", "손연재", "박정현");
		
		//이름에 "손"이 들어가 있는 사람 count(방법-1)
		long count = 0;
		for(String name: nameList) {
			if(name.contains("손")) {
				count++;
			}
		}
		System.out.println("count:" + count);
		
		//이름에 "손"이 들어가 있는 사람 count(방법-2)
		count = 0;		
		count = nameList.stream()
				        .filter( (s) -> s.contains("손")).count();
		System.out.println("count:" + count);
	}
}
