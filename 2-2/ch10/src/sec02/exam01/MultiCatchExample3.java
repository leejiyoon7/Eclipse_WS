package sec02.exam01;

public class MultiCatchExample3 {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		//Multi catch는 하나의 catch 블럭에서 여러 개의 예외를 처리할 수 있음
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result:" + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("실행 중 예외가 발생하였습니다." + e);
		} finally {
			System.out.println("Done");
		}
	}
}
