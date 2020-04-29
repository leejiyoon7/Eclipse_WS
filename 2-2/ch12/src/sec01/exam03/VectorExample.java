package sec01.exam03;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import sec01.exam02.Member;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
	
		//Board 객체 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
				
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content 
					                         + "\t" + board.writer);
		}
		
		list.remove(2);
		list.remove(3);		
		
		System.out.println("=====================");
		
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {//현재 커서 다음에 요소가 있는지 판단
			Board board = iter.next();
			System.out.println(board.subject + "\t" + board.content 
					                                + "\t" + board.writer);
		}
	}
}


