package sec01.exam12;

public class DaemonExample {
	public static void main(String[] args) {
		//������ ����
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		//main �������� ���� ������ ����
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			//5�� �Ŀ� main �����尡 ���ታ-���� �����嵵 �Բ� �����
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("���� ������ ����");
	}
}
