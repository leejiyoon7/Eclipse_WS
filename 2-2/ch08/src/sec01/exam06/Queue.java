package sec01.exam06;

public interface Queue {
	// �ԷµǴ� ��Ұ��� �迭�� �� �������� �߰��ϴ� �޼���
	void enQueue(String title);
	
	// �迭�� �� ó�� �׸� ��ȯ �޼���
	String deQueue();
	
	//���� Queue�� �ִ� ��� ���� ��ȯ �޼���
	int getSize();
}
