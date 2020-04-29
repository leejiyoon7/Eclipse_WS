package sec01.exam10;

public class WaitNotifyExample {
	public static void main(String[] args) {
		//공유 객체 생성
		DataBox dataBox = new DataBox();
		
		//스레드 생성
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}
}
