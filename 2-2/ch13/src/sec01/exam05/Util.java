package sec01.exam05;

public class Util {
	/* �� ���� Pair��ü�� �Ű������� �޾Ƽ� ���Ͽ� ��ȯ�ϴ� compare() �޼��� ����
	 * - Pair<K, V>: ��Ƽ Ÿ�� �Ķ���͸� ���� ���׸� Ÿ���� Ŭ����
	 * - �� ��ü�� K�� V�� ���� ���Ͽ� ������ true, Ʋ���� false ����
	 */
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		//p1.getKey()�� p2.getKey()�� ��
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		
		//p1.getValue()�� p2.getValue()�� ��
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		//������ ����� ����
	    return keyCompare && valueCompare;
	}
}
