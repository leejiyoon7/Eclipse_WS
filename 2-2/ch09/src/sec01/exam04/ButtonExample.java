package sec01.exam04;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		//��ư �̺�Ʈ ó�� - ��ȭ�ɱ�
		btn.setOnClickListener(new CallListener());
		btn.touch();		
		//��ư �̺�Ʈ ó�� - �޽��� ������
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		//�͸� ���� ��ü�� �����Ͽ� �̺�Ʈ ó���ϴ� ���- �ַ� ���
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");				
			}
		});
		btn.touch();		
	}
}
