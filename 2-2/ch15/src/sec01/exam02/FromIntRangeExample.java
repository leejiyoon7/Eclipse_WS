package sec01.exam02;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;
	
	public static void main(String[] args) {
		//rangeClosed(1,  100): 1~100������ �ش��ϴ� ������ �����ͼ� IntStream ��������
		IntStream stream = IntStream.rangeClosed(1,  100);
		
		stream.forEach(a -> sum += a);//1~100������ ��
		System.out.println("����: " + sum);
	}
}
