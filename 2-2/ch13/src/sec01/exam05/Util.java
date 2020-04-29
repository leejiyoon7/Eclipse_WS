package sec01.exam05;

public class Util {
	/* 두 개의 Pair객체를 매개변수로 받아서 비교하여 반환하는 compare() 메서드 선언
	 * - Pair<K, V>: 멀티 타입 파라미터를 갖는 제네릭 타입의 클래스
	 * - 두 객체의 K와 V의 값을 비교하여 같으면 true, 틀리면 false 리턴
	 */
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		//p1.getKey()와 p2.getKey()를 비교
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		
		//p1.getValue()와 p2.getValue()를 비교
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		//연산의 결과를 리턴
	    return keyCompare && valueCompare;
	}
}
