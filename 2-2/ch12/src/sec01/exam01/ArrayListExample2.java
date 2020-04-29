package sec01.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");
		//ArrayList의 모든 데이터를 문자열로 반환하여 출력
		System.out.println("1 : " + list.toString());

		list.add(1, "LA");
		print(2, list);

		/* 매개변수로 전달받은 요소의 인덱스를 추출
		   - int indexOf(Object o): 앞에서부터 검색하여 처음 검색된 데이터의 인덱스 반환
		   - int lastIndexOf(Object o): 끝에서부터 검색하여 처음 검색된 데이터의 인덱스 반환
		 */
		System.out.println("3 : " + list.indexOf("서울"));
		System.out.println("4 : " + list.lastIndexOf("서울"));

		/* 매개변수로 전달받은 데이터를 삭제(삭제 후 오른쪽 데이터가 왼쪽으로 이동) 
		 * boolean remove(Object o)
		 */
		list.remove("LA");
		print(5, list);

		/* 매개변수로 전달받은 인덱스의 데이터를 삭제(삭제 후 오른쪽 데이터가 왼쪽으로 이동) 
		 *  E remove(int index)
		 */
		list.remove(2);
		print(6, list);

		/* 매개변수로 전달한 데이터가 list에 포함되어 있는지 판단(true/false 반환)
		 *  boolean contains(Object o)
		 */
		System.out.println("7 : " + list.contains("LA"));

		/* ArrayList의 데이터를 가진 Object 타입의 배열을 생성하여 반환
		 * Object[] toArray()
		 */
		Object obj[] = list.toArray();
		System.out.println("8 : " + Arrays.toString(obj));

		/*  ArrayList의 데이터를 가진  Object 타입이 아닌 특정 타입의  배열을 생성하여 반환
		 * <T> T[] toArray(T[] a)
		 */
		String cities[] = new String[0];//String타입의 cities[] 배열 생성
		//배열(cities)이 String 타입이므로 list의 데이터를 String 타입의 배열을 생성히여 반환
		cities = list.toArray(cities);
		System.out.println("9 : " + Arrays.toString(cities));

		/*  ArrayList의 모든 데이터를 삭제
		 * void clear()
		 */
		list.clear();
		print(10, list);

		/* list가 비어 있는지 확인
		 * boolean isEmpty()
		 */
		System.out.println("11: " + list.isEmpty());

		//list에 데이터 추가
		list.add("파리");
		list.add("방콕");
		list.add("LA");

		/* Arrays.asList() 메서드로 인자로 전달된 데이터를 가지는 List 객체 생성
		 *  Arrays 클래스의 static <T> List<T> asList(T... a)
		 */
		List<String> list2 = Arrays.asList("서울", "뉴욕", "상해");
		print(12, list2);

		/* addAll() 메서드의 인자로 전달된 컬렉션(list2)을 현재 컬렉션(list)에 추가
		 *  boolean addAll(Collection<? extends E> c)
		 */
		list.addAll(list2);
		print(13, list);

		/* containsAll() 메서드는 list에 list2 컬렉션의 내용이 포함되어 있는지 판단(true/false)
		 * boolean containsAll(Collection<?> c)
		 */
		System.out.println("14: " + list.containsAll(list2));

		/* retainAll() 메서드는 list에서 list2 컬렉션의 데이터만 남겨두고 모두 삭제
		 * boolean retainAll(Collection<?> c)
		 */
		list.retainAll(list2);
		print(15, list);

		/* removeAll() 메서드는 list에서 list2 컬렉션의 모든 데이터를 삭제
		 * boolean removeAll(Collection<?> c)
		 */
		list.removeAll(list2);
		print(16, list);
	}

	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list.toString());
		//System.out.println(n + " : " + list);
	}
}
