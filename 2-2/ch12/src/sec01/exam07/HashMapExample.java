package sec01.exam07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("손흥민", 95);
		map.put("이강인", 90);
		map.put("손흥민", 97);//키가 중복되면 마지막에 저장된 값을 대체
		map.put("황의조", 93);
		System.out.println("총 Entry 수: " + map.size());//총 Entry 수 얻기
		
		//객체 찾기		
		System.out.println("\t손흥민 : " + map.get("손흥민"));//키로 값 검색
		System.out.println();
		
		//keySet() 메서드로 Map 컬렉션의 키만 뽑아 Set 컬렉션으로 저장 
		Set<String> keySet = map.keySet();
		//keySet 컬렉션을 Iterator 객체로 변환하여 반복 처리(객체를 하나씩 처리)
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {//반복해서 키를 얻고 값을 Map에서 얻어냄
		  String key = keyIterator.next();//키를 하나 가져옴
		  Integer value = map.get(key);//가져온 키로 값을 가져옴
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
		//객체 삭제
		map.remove("손흥민");
		System.out.println("총 Entry 수: " + map.size());
		
		//entrySet() 메서드로  모든 Map.entry 객체를 뽑아 Set 컬렉션으로 저장 
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//entrySet 컬렉션을 Iterator 객체로 변환하여 반복 처리(객체를 하나씩 처리)
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {//반복해서 Map.entry를 얻고 키와 값을 Map에서 얻어냄
		  //Map.Entry 객체를 하나씩 가져옴	
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();//entry 객체에서 키를 가져옴
		  Integer value = entry.getValue();//entry 객체에서 값을 가져옴
		  System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//Map 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
