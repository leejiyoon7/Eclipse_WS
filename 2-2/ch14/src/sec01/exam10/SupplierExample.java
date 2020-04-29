package sec01.exam10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		//매개변수 없이 처리한 결과를 T 타입으로 반환하는 Supplier 함수형 인터페이스를 람다식으로 구현
		Supplier<String> day = () -> { return new SimpleDateFormat("E요일").format(new Date());};
		//day.get() 메서드로 호출하여 결과 값을 받아 처리
		String result = day.get();
		System.out.println(result);
	
		System.out.println();
		
		//주사위 값을 난수로 발생하여 int로 반환하는 IntSupplier 함수형 인터페이스를 람다식으로 구현
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		//intSupplier.getAsInt() 호출
		int num = intSupplier.getAsInt();
		System.out.println("주사위 수: " + num);
	}
}
