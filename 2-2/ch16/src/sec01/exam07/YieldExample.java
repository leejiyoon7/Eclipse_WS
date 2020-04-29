package sec01.exam07;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();	
		threadA.start();		
		threadB.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false;//threadA ���� ��� ���·� ���� - threadB ����
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = true;//threadA�� threadB�� ������ ����
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;//threadA ����
		threadB.stop = true;//threadB ����
	}
}
