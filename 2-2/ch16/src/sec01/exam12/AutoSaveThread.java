package sec01.exam12;

//�ڵ� ���� ������ Ŭ����
public class AutoSaveThread extends Thread {
	//save �޼��� ����
	public void save() {
		System.out.println("�۾� ������ ������.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;//���ܹ߻��ϸ� while�� ����
			}
			save();//1�� ������ save
		}
	}
}
