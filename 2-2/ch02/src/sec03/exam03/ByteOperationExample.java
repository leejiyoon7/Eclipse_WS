package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		/* ������ �ܰ迡���� ���� ����- �����Ϸ��� ���� ����
		 * - ���� ���ͷ��� �����ϴ� ���, �����Ϸ��� ������ �ܰ迡�� ���� ���ͷ���
		 *   ���� ����� ������ ���� Ÿ������ ��ȯ�Ͽ� ������ �����ϰ�, 
		 *   �� ����� result1 ������ ����
		 */
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		/* ���ͷ��� ������ ����� ��쿡�� JVM���� ���� ����
		 * ����� JVM�� �ǿ����� ���� x, y�� Ÿ����  int�� �ڵ� Ÿ�� ��ȯ��  ���� ����
		 */
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}
}

