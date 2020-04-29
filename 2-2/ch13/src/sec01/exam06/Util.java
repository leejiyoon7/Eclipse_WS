package sec01.exam06;

public class Util {
	/* �Ű������� 2���� ������ �޾� Number �߻� Ŭ������ doubleValue() �޼���� ���Ͽ� ��ȯ�ϴ� compare() �޼��� ����
	 * - �ΰ��� Ÿ�� �Ķ���ͷ� �Ű����� ����
	 * - �Ű������� Ÿ�� �Ķ���ͷ� ����� Ÿ�� �Ķ���͸�  <T extends Number>���� : ��ü���� Ÿ���� Number Ŭ���� 
	 *   �Ǵ� ���� Ŭ������  ����ϵ��� ����(Number: java.lang.Number �߻�Ŭ����)
	 *   t1 > t2 : 1, t1 < t2: -1 ����(t1�� �������� ��)
	 */
	public static <T extends Number> int compare(T t1, T t2) {
		//doubleValue(): Number ��ü�� ���� primitive data type(double Ÿ��)���� ��ȯ
		double v1 = t1.doubleValue();
		System.out.println(t1.getClass().getName());
		
		double v2 = t2.doubleValue();
		System.out.println(t2.getClass().getName());
		
		/* v1�� v2�� ��
		 * 1v>v2 : 1 
		 * 1v<v2 : -1 
		 */
		return Double.compare(v1, v2);
	}
}
