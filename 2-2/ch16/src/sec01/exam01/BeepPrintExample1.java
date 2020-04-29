package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		//작업1: 비프음 5번 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
		
		//작업2: "띵" 문자열 5번 출력
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
	}
}
