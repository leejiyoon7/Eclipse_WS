package sec01.exam10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		/* Consumer �Լ��� �������̽��� �Ű����� �ְ� ���ϰ��� ���� accept() �߻�޼��� ��� */
		Consumer<String> consumer = (t) -> System.out.println(t + "8");
		//Consumer�� �߻�޼����� accept() �޼���� �Ű������� �޾� ���ٽ����� ó��(t�� �Ű��� ����)
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "8");
		
		DoubleConsumer doubleConsumer = (d) -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		Consumer<Date> date = (d) -> {
			String s = new SimpleDateFormat("YY-MM-dd").format(d);
			System.out.println(s);
		};

		//Date ��ü�� �����Ͽ� accept() �޼����� ���ڷ� ����(d�� ����)
		date.accept(new Date());
	}
}
