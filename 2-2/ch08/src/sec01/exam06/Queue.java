package sec01.exam06;

public interface Queue {
	// 입력되는 요소값을 배열의 맨 마지막에 추가하는 메서드
	void enQueue(String title);
	
	// 배열의 맨 처음 항목 반환 메서드
	String deQueue();
	
	//현재 Queue에 있는 요소 개수 반환 메서드
	int getSize();
}
