package sec01.exam06;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);//배열(shelf)에 요소 추가
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);//맨 처음 요소를 배열에서 삭제하고 반환
	}

	@Override
	public int getSize() {
		return getCount();//현재 Queue에 있는 요소 개수 반한
	}

    //책 목록 출력 메서드
	public void bookInfo() {
		System.out.println("[책 목록 ]");
		
		for(Object object : shelf) {
		    String book = (String) object;
		    System.out.println(book);
		}
	}
}

