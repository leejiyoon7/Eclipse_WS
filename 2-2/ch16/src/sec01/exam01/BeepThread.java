package sec01.exam01;

import java.awt.Toolkit;

//Thread Ŭ������ ����� BeepThread Ŭ���� 
public class BeepThread extends Thread {
	@Override
	public void run() {	
		//�۾�1: ������ 5�� ���
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
	}
}

