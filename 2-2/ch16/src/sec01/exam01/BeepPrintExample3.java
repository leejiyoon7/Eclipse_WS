package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//���1
		Thread thread = new BeepThread();
		
		//���2
		/*Thread thread = new Thread() {
			@Override
			public void run() {		
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};*/	

		thread.start();		
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
	}
}

