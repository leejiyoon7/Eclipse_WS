package sec03.exam05;

public class ExplicitConversionExample {
	public static void main(String[] args) {
		double dNum = 5.7;
		float fNum = 1.7f;
		
		int result1 = (int) dNum + (int) fNum;//�� �Ǽ��� ���� ���� ����ȯ
		int result2 = (int) (dNum + fNum);//fNum�� double�� ��ȯ�Ǿ� ����ϰ� int�� ���� ����ȯ		
		float result3 = (float) (dNum + fNum);//fNum�� double�� ��ȯ�Ǿ� ����ϰ� float���� ���� ����ȯ
		double result4 = dNum + fNum;//fNum�� double�� �ڵ� ��ȯ�Ǿ� ���
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
	}
}
