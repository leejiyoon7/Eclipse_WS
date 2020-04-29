package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//���1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//���2 - �͸�����ü
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(2000); } catch(Exception e) {}
				}
			}
		});*/
		
		//���3 - ���ٽ�
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(2000); } catch(Exception e) {}
			}
		});*/
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
	}
}


