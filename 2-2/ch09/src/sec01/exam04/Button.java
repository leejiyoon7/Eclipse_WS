package sec01.exam04;

public class Button {
	//�ʵ� ����
	OnClickListener listener;//���� �������̽� Ÿ������ ����
	
	//�޼ҵ� ����
	//OnClickListener �������̽��� ������ �پ��� ���� ��ü�� ���ڷ� ���� �� �ֵ��� �Ű����� ����(������)
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		//button�� ��ġ�ϸ� ���� ��ü�� onClick()�޼��� ȣ��
		listener.onClick();
	}

	/* ���� �������̽� ����
	 * �����������̽�(OnClickListener)�� Button class���� �̺�Ʈ ó���� ���� ���
	 */
	static interface OnClickListener {
		//�߻� �޼��� ����
		void onClick();
	}	
}
