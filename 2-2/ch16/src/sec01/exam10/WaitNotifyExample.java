package sec01.exam10;

public class WaitNotifyExample {
	public static void main(String[] args) {
		//���� ��ü ����
		DataBox dataBox = new DataBox();
		
		//������ ����
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}
