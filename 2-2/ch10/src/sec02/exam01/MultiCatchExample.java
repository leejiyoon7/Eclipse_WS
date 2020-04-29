package sec02.exam01;

public class MultiCatchExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		/* mluti catch : try 블럭에서 여러 개의 예외가 발생하면 예외별로 catch를 처리  */
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result:" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다." + e);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다." + e);
		} finally {
			System.out.println("Done");
		}
	}
}
