package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		//�۾�1: ������ 5�� ���
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
		
		//�۾�2: "��" ���ڿ� 5�� ���
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(2000); } catch(Exception e) {}
		}
	}
}
