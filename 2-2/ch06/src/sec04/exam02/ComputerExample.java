package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		//객체 생성
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		//배열 변수을 매개변수로 전달
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		//배열을 생성하여 매개변수로 전달
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);		
		
		//값 목록을 매개변수로 전달
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		//값 목록을 매개변수로 전달
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}
}
