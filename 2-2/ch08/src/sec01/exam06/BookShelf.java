package sec01.exam06;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);//�迭(shelf)�� ��� �߰�
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);//�� ó�� ��Ҹ� �迭���� �����ϰ� ��ȯ
	}

	@Override
	public int getSize() {
		return getCount();//���� Queue�� �ִ� ��� ���� ����
	}

    //å ��� ��� �޼���
	public void bookInfo() {
		System.out.println("[å ��� ]");
		
		for(Object object : shelf) {
		    String book = (String) object;
		    System.out.println(book);
		}
	}
}

