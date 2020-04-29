package sec01.exam02;

public class MyLinkedList {
	private Node head = null;

	//inner class
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}//end of inner class

	//내부 클래스의 Node 인스턴스 생성
	public void add(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}

	//Node의 data 값 출력
	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}
