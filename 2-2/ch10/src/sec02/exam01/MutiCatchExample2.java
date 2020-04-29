package sec02.exam01;

public class MutiCatchExample2 {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		//다중 catch블럭을 작성할 때는 하위 예외클래스를 먼저 작성하고, 마지막에 상위예외클래스(Exception) 작성
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result:" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {//ArrayIndexOutOfBoundsException을 제외한 모든 예외를 처리함
			System.out.println("숫자로 변환할 수 없습니다." + e);
		} finally {
			System.out.println("Done");
		}
	}
}

