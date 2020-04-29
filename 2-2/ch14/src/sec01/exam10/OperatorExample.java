package sec01.exam10;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	/* �ִ밪�� �ּҰ��� �����ϴ� maxOrMin() �޼��� 
	 * applyAsInt(result, score): �� ���� int�� �Ű������� �޾� ������ �� int�� ��ȯ�ϴ� �޼���
	 */
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//�ִ밪 ���
		int max = maxOrMin(//IntBinaryOperator ������ü�� �����ϴ� ���ٽ�
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("�ִ밪: " + max);
		
		//�ּҰ� ���
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("�ּҰ�: " + min);
	}
}
