package sec03.exam04;

public class DoubleOperationExample {
	public static void main(String[] args) {
		//�ǿ����� �� ũ�Ⱑ  ū Ÿ������ �ڵ� Ÿ�� ��ȯ
		
		int intValue = 10;
		double doubleValue = 5.5;
		
		double result = intValue + doubleValue;	
		System.out.println("result : " + result);	
		
		//int�� ���� ĳ����
		int result2 = intValue + (int) doubleValue;	
		System.out.println("result2 : " + result2);	
	}
}

