package sec01.exam02;

public class AnonymousObjectExample {
	public static void main(String[] args) {
		//RemoteControl �������̽��� �͸� ���� ��ü ����
		RemoteControl rc = new RemoteControl() {
			//�ʵ�
			private int volume;
			
			//turnOn() �߻� �޼ҵ��� ���� �޼ҵ�
			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
				messageInfo("TV ��û�� �����մϴ�.");
			}	
			//turnOff() �߻� �޼ҵ��� ���� �޼ҵ�
			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
				messageInfo("TV ��û�� �Ұ����մϴ�.");
			}
			//setVolume() �߻� �޼ҵ��� ���� �޼ҵ�
			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("���� TV ����: " + this.volume);
			}
			
			//�͸� ���� ��ü�ȿ��� �޼��� ����
			public void messageInfo(String message) {
				System.out.println(message);
			}
		};
		
		//�͸� ���� ��ü�� �޼��� ȣ��
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		//�͸� ������ü �ȿ� ����� ����� �͸� ������ü �ȿ����� ��� ����
		//rc.messageInfo("�͸� ���� ��ü �޼��� ȣ��");
	}//end of main	
}
