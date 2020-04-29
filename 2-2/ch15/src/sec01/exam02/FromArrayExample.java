package sec01.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "¼ÕÈï¹Î", "ÀÌ°­ÀÎ", "±è¿¬¾Æ"};
		
		//¹è¿­·ÎºÎÅÍ stream °´Ã¼¸¦ ¾ò¾î¿È 
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
	}
}
