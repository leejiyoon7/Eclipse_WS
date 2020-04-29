package sec01.exam01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("¼ÕÈï¹Î", "ÀÌ°­ÀÎ", "±è¿¬¾Æ");
		
		//Iterator ÀÌ¿ë
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//Stream ÀÌ¿ë
		Stream<String> stream = list.stream();//stream °´Ã¼¸¦ ÂüÁ¶
		stream.forEach( name -> System.out.println(name) );
	}
}
