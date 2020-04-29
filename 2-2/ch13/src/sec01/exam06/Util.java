package sec01.exam06;

public class Util {
	/* 매개변수로 2개의 정수를 받아 Number 추상 클래스의 doubleValue() 메서드로 비교하여 반환하는 compare() 메서드 선언
	 * - 두개의 타입 파라미터로 매개변수 선언
	 * - 매개변수의 타입 파라미터로 사용할 타입 파라미터를  <T extends Number>선언 : 구체적인 타입을 Number 클래스 
	 *   또는 하위 클래스만  사용하도록 제한(Number: java.lang.Number 추상클래스)
	 *   t1 > t2 : 1, t1 < t2: -1 리턴(t1을 기준으로 비교)
	 */
	public static <T extends Number> int compare(T t1, T t2) {
		//doubleValue(): Number 객체의 값을 primitive data type(double 타입)으로 변환
		double v1 = t1.doubleValue();
		System.out.println(t1.getClass().getName());
		
		double v2 = t2.doubleValue();
		System.out.println(t2.getClass().getName());
		
		/* v1과 v2를 비교
		 * 1v>v2 : 1 
		 * 1v<v2 : -1 
		 */
		return Double.compare(v1, v2);
	}
}
