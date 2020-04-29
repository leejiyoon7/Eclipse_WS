package sec01.exam10;

//공유객체 클래스
public class DataBox {
	private String data;
	
	//ConsummerThread가 호출하는 동기화 메서드
	public synchronized String getData() {
		if(this.data == null) {//data가 없으면
			try {
				wait();//ConsummerThread를 일시정지
			} catch(InterruptedException e) {}
		}
		
		//data가 있으면
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		data = null;//data필드를 null 저장
		notify();//ProducerThread를 실행대기로 전환
		return returnValue;
	}
	
	//ProducerThread가 호출하는 동기화 메서드
	public synchronized void setData(String data) {
		if(this.data != null) {//아직 ConsummerThread가 데이터를 읽지 않은 경우
			try {
				wait();//ProducerThread를 일시 정지
			} catch(InterruptedException e) {}
		}
		
		//data==null이면
		this.data = data;//data필드에 값 저장
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();//ConsummerThread를 실행대기로 전환
	}
}


