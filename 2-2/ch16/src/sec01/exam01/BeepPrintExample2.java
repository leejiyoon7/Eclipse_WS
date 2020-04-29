package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//规过1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//规过2 - 劳疙备泅按眉
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
		
		//规过3 - 恩促侥
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(2000); } catch(Exception e) {}
			}
		});*/
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("厄");
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
	}
}


