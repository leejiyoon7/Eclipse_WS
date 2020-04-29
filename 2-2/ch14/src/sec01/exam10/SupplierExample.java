package sec01.exam10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		//�Ű����� ���� ó���� ����� T Ÿ������ ��ȯ�ϴ� Supplier �Լ��� �������̽��� ���ٽ����� ����
		Supplier<String> day = () -> { return new SimpleDateFormat("E����").format(new Date());};
		//day.get() �޼���� ȣ���Ͽ� ��� ���� �޾� ó��
		String result = day.get();
		System.out.println(result);
	
		System.out.println();
		
		//�ֻ��� ���� ������ �߻��Ͽ� int�� ��ȯ�ϴ� IntSupplier �Լ��� �������̽��� ���ٽ����� ����
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		//intSupplier.getAsInt() ȣ��
		int num = intSupplier.getAsInt();
		System.out.println("�ֻ��� ��: " + num);
	}
}
