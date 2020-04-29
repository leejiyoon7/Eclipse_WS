package sec01.exam01;

import java.awt.Toolkit;

//Thread 클래스를 상속한 BeepThread 클래스 
public class BeepThread extends Thread {
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

