package sec01.exam10;

public class ConsumerThread extends Thread {
	//공유객체 필드 선언
	private DataBox dataBox;

	//생성자
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			//공유객체에서 data 가져옴
			String data = dataBox.getData();
		}
	}
}

