package sec04.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		//��ü ����
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		//�迭 ������ �Ű������� ����
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		//�迭�� �����Ͽ� �Ű������� ����
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);		
		
		//�� ����� �Ű������� ����
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		//�� ����� �Ű������� ����
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}
}