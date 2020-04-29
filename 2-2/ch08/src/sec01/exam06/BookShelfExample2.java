package sec01.exam06;

public class BookShelfExample2 {
	public static void main(String[] args) {

		//Queue 인터페이스 타입 변수에 BookShelf() 객체 할당
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println("책장에 몇권의 책이 있나요? : " + shelfQueue.getSize() + "권");
	
		//책장(BookShelf)에서 책 목록을 보기위해 BookShelf로 다운 케스팅
		if (shelfQueue instanceof BookShelf) {
			BookShelf bookShelf = (BookShelf)shelfQueue;
			
			//책 목록 출력 메서드 호출
			bookShelf.bookInfo();
		}
		
		System.out.println("====== 책 꺼내기 ======");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	}
}
