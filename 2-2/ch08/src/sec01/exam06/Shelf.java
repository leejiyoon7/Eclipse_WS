package sec01.exam06;

import java.util.ArrayList;

public class Shelf {
	//자료를 순서대로 저장할 ArrayList 선언(shelf)
	protected ArrayList<String> shelf;
	
	/* 생성자
	   - Shelf 객체 생성시 배열 shelf도 생성
	 */
	public Shelf(){
		shelf = new ArrayList<String>();
	}
	
	// 배열 Shelf에 저장된 요소 개수를 반환
	public int getCount(){
		return shelf.size();
	}
}
