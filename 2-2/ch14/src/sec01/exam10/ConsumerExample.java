package sec01.exam10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		/* Consumer 함수적 인터페이스는 매개값만 있고 리턴값이 없는 accept() 추상메서드 사용 */
		Consumer<String> consumer = (t) -> System.out.println(t + "8");
		//Consumer의 추상메서드인 accept() 메서드로 매개변수를 받아 람다식으로 처리(t에 매개값 전달)
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "8");
		
		DoubleConsumer doubleConsumer = (d) -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		Consumer<Date> date = (d) -> {
			String s = new SimpleDateFormat("YY-MM-dd").format(d);
			System.out.println(s);
		};

		//Date 객체를 생성하여 accept() 메서드의 인자로 전달(d에 전달)
		date.accept(new Date());
	}
}
