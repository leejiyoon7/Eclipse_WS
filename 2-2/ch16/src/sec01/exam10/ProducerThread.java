package sec01.exam10;

public class ProducerThread extends Thread {
	//공유객체 필드 선언
	private DataBox dataBox;

	//생성자
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = "Data-" + i;
			//공유객체에 data 저장
			dataBox.setData(data);
		}
	}
}
