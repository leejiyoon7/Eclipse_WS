package sec01.exam12;

//자동 저장 스레드 클래스
public class AutoSaveThread extends Thread {
	//save 메서드 선언
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;//예외발생하면 while문 종료
			}
			save();//1초 단위로 save
		}
	}
}
