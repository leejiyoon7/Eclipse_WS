package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("부산");
		list.add("도쿄");
		list.add("뉴욕");

		System.out.println("==== 일반 for ====");
		
		//일반 for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("===== 향상된 for ====");

		//향상된 for
		for (String city : list) {
			System.out.println(city);
		}

		System.out.println("===== iterator =====");
		
		/* iterator() 메서드는 컬렉션 객체를 Iterator 객체로 변환하여 반환
		 * 모든 List, Set 계열의 컬렉션 객체를 Iterator 객체로 변환하여 사용 가능  */
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {//현재 커서 다음에 요소가 있는지 판단
			System.out.println(iter.next());//커서 다음 요소를 반환하고, 커서를 다음 요소로 이동
		}
		
		System.out.println("==== forEach =====");
		
		/* Java 8에 람다가 도입도면서 가장 큰 영향을 받은 기존의 API는 콜렉션(Collection)이다. 
		 * Collection에 추가된 forEach()와 stream()은 람다방식으로 값의 덩어리들을 처리하기 위해 만들어진 API이다.
		 * 기존의 List,Map,Set등에서 forEach API가 람다를 파라미터값으로 받는다.  
		 * 람다식 안에서는 각 엘리먼트에 대한 개별 처리를 정의한다.
		 */
		
		list.forEach((city) -> {
			System.out.println(city);
		});
		
		/* forEach 더블콜론 연산자
		 * 자바8에서 추가된 메서드 참조(Method Reference) 연산자
		 * 메서드 참조는 람다식과 동일한 람다식과 동일한 처리 방법을 갖는 표현식이지만
		 * 람다 본분(body)를 제공하는 대신, 이름으로 기존 메서드를 참조함
		 * 메서드 참조 사용법 : 타겟 참조객체(타겟 레퍼런스)::메서드이름
		 * Computer::getAge;// Computer라는 클래스에 정의된 getAge 메소드에 대한 Method Reference
		 * System.out 참조안의 println 메서드에 파라미터로 list안의 값을 하나씩 전달하여 출력
		 */
		list.forEach(System.out::println);
		
		//list.forEach(city -> System.out.println(city) );
		
		System.out.println("==== map =====");
		//map
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "손흥민");
		namesMap.put(2, "이강인");
		namesMap.put(3, "황의조");
		
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		
		System.out.println("==== map =====");
		//entrySet(): key와 value의 쌍으로 구성된 모든 map.entry 객체를 set객체에 담아 리턴
		namesMap.entrySet().forEach(entry -> System.out.println(
				  entry.getKey() + " " + entry.getValue()));
	}
}
