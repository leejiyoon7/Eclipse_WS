package sec01.exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("부산");
		list.add("도쿄");
		list.add("뉴욕");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==============");

		/* iterator() 메서드는 컬렉션 객체를 Iterator 객체로 변환하여 반환
		 * 모든 List, Set 계열의 컬렉션 객체를 Iterator 객체로 변환하여 사용 가능  */
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {//현재 커서 다음에 요소가 있는지 판단
			System.out.println(iter.next());//커서 다음 요소를 반환하고, 커서를 다음 요소로 이동
		}
	}
}
