package sec01.exam06;

//EmptyStringException ����
public class EmptyStringException extends Exception {
	//������
	public EmptyStringException() {
		//�θ� �����ڸ� ȣ���Ͽ� ���ܹ߻��� ����� �޽��� ����
		super("�� ���ڿ��Դϴ�.");
	}
}
