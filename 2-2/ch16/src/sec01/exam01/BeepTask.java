package sec01.exam01;

import java.awt.Toolkit;

//Runnable �������̽��� ������ Ŭ���� ����
public class BeepTask implements Runnable {	
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

