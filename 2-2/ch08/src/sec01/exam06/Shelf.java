package sec01.exam06;

import java.util.ArrayList;

public class Shelf {
	//�ڷḦ ������� ������ ArrayList ����(shelf)
	protected ArrayList<String> shelf;
	
	/* ������
	   - Shelf ��ü ������ �迭 shelf�� ����
	 */
	public Shelf(){
		shelf = new ArrayList<String>();
	}
	
	// �迭 Shelf�� ����� ��� ������ ��ȯ
	public int getCount(){
		return shelf.size();
	}
}
