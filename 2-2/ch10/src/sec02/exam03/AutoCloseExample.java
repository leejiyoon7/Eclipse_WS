package sec02.exam03;

public class AutoCloseExample {
	public static void main(String[] args) {
		//����� ���ҽ� ��ü ����
		AutoCloseObj obj = new AutoCloseObj();
		try (obj){//�ڹ� 9���� �ܺο� ����� ���ҽ� ���� ��밡��
			//������ ���� �߻�
			throw new Exception();
		}catch(Exception e) {
			System.out.println("���� �κ� �Դϴ�");
		}
	}
}
