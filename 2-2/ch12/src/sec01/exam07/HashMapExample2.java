package sec01.exam07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {

		//HashMap 객체 생성(HashMap<key타입, value타입>)
		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("초지일관", "처음에 세운 뜻을 이루려고 끝까지 밀고 나감");
		dic.put("고진감래", "고생 끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질정도로 노력을 다함");
		dic.put("형설지공", "고생하면서 꾸준히 학문을 닦음");
		dic.put("금의환향", "성공하여 고향에 돌아옴");
		dic.put(null, null); // HashMap은 null 값 저장 가능

		// 방법1 : keySet()
		//keySet 컬렉션을 Iterator 객체로 변환하여 반복 처리(객체를 하나씩 처리)
		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}

		// 방법2 : entrySet()으로 반복처리(for())
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		}

		// 방법3 : keySet()으로 반복처리(for())
		for (String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
	}
}
