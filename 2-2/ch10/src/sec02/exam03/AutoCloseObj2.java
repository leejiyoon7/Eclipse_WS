package sec02.exam03;

//AutoCloseable �������̽��� ������ AutoCloseObj Ŭ���� ����
public class AutoCloseObj2 implements AutoCloseable{

	//AutoCloseable �������̽��� close() �������̵�
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� close() �Ǿ����ϴ�");
	}
}
