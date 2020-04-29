package sec01.exam01;

import java.awt.Toolkit;

//Runnable 인터페이스를 구현한 클래스 선언성
public class BeepTask implements Runnable {	
	@Override
	public void run() {
		//작업1: 비프음 5번 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(2000); } catch(Exception e) {}
		}		
	}	
}

