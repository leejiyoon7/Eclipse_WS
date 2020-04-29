package sec01.exam06;

public class BookShelfExample {
	public static void main(String[] args) {

		//Queue 인터페이스 타입 변수에 BookShelf() 객체 할당
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println("책장에 몇권의 책이 있나요? : " + shelfQueue.getSize() + "권");
			
		System.out.println("[책을 순서대로 꺼내기]");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	}
}
