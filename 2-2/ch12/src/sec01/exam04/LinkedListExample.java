package sec01.exam04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		//String 타입의 빈 LinkedList 생성
		LinkedList<String> list = new LinkedList<String>();

		//데이터 추가
		list.add("서울");
		list.add("북경");
		list.add("상해");

		//요소 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}

		list.add(1, "LA");//인덱스 1에 LA추가
		print(1, list);
		list.addFirst("런던");//첫노드에 런던추가
		print(2, list);
		list.addLast("서울");//마지막 노드로 서울추가
		print(3, list);

		list.offer("파리");//리스트의 끝에 파리를 추가하고 true반환(오류시 false)
		print(4, list);
		list.offerFirst("로마");//리스트의 첫번째 노드로 로마를 추가하고 true반환
		print(5, list);
		list.offerLast("베른");//리스트의 마지막 노드로 베른를 추가하고 true반환
		print(6, list);

		System.out.println("7 : " + list.peek());//첫번쨰 노드 추출
		System.out.println("8 : " + list.peekFirst());//첫번쨰 노드 추출
		System.out.println("9 : " + list.peekLast());//마지막 노드 추출

		list.poll();//첫번쨰 노드를 추출하고 list에서 삭제
		print(10, list);
		list.pollFirst();//첫번쨰 노드를 추출하고 list에서 삭제
		print(11, list);
		list.pollLast();//마지막 노드를 추출하고 list에서 삭제
		print(12, list);

		list.push("제주");//첫번쨰 위치에 제주 추가
		print(13, list);
		System.out.println("14 : " + list.pop());//첫번쨰 위치한 데이터 추출/삭제
		
		System.out.println("15 : " + list.get(3));//인덱스 3번 데이터 추출
		System.out.println("16 : " + list.getFirst());//첫번쨰 위치한 데이터 추출
		System.out.println("17 : " + list.getLast());//마지막 위치한 데이터 추툴

		System.out.println("18 : " + list.indexOf("서울"));//앞에서부터 서울을 찾아 인덱스 반환
		System.out.println("19 : " + list.lastIndexOf("서울"));//뒤에서부터 서울을 찾아 인덱스 반환

		list.removeFirst();//첫번째 데이터 삭제
		print(20, list);
		list.removeLast();//마지막 데이터 삭제
		print(21, list);
		list.remove(3);//3번 인텍스 데이터 삭제
		print(22, list);
		list.remove("LA");//LA 데이터를 찾아 삭제
		print(23, list);

		//List 객체 생성
		List<String> list2 = Arrays.asList("북경", "상해");
		list.addAll(list2);//list2를 list에 추가

		Object obj[] = list.toArray();//List 객체를 Object 타입의 일반 배열로 반환
		System.out.println("24 : " + Arrays.toString(obj));

		String cities[] = new String[0];
		cities = list.toArray(cities);//cities 타입 배열로 List 배열을 변환하여 반환
		System.out.println("25 : " + Arrays.toString(cities));

		list.removeAll(list2);//모든 데이터 삭제
		print(26, list);
	}

	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}
}
