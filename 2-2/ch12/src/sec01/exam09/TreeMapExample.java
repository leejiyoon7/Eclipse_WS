package sec01.exam09;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<String, String>();

		users.put("20190301", "김푸름");
		users.put("20180620", "김하늘");
		users.put("20170817", "오정임");
		users.put("20190728", "김유빈");
		users.put("20150924", "이정은");

		System.out.println(users);

		Map.Entry<String, String> entry = null;

		entry = users.firstEntry();//첫번째 Entry 반환
		print("입사일자가 가장 빠른 사람 ", entry);

		entry = users.lastEntry();//맵에서 가장 큰 키값의 Entry 반환
		print("입사일자가 가장 늦은 사람", entry);

		entry = users.lowerEntry("20191231");//지정된 키보다 작은 값 중, 가장 작은 키값의 Entry 반환
		print("2012년도에 가장 늦게 입사한 사람", entry);

		entry = users.higherEntry("20190101");//지정된 키보다 큰 값 중, 가장 큰 키값의 Entry 반환
		print("2019년도에 가장 빠르게 입사한 사람", entry);

		//모든 Entry를 반환한 후 삭제 
		while (!users.isEmpty()) {
			//현재 맵의 가장 작은 키값의 Entry를 반환한 후 삭제 
			entry = users.pollFirstEntry();
			print("퇴직한 사람", entry);
			System.out.println("남아있는 직원 수 : " + users.size());
		}
	}

	public static void print(String s, Map.Entry<String, String> entry) {
		System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
	}
}
