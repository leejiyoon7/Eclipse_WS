package sec01.exam03;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import sec01.exam02.Member;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
	
		//Board ��ü ����
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
				
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content 
					                         + "\t" + board.writer);
		}
		
		list.remove(2);
		list.remove(3);		
		
		System.out.println("=====================");
		
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {//���� Ŀ�� ������ ��Ұ� �ִ��� �Ǵ�
			Board board = iter.next();
			System.out.println(board.subject + "\t" + board.content 
					                                + "\t" + board.writer);
		}
	}
}


