package sec02.exam04;

public class ThrowsExceptionExample {
	public static void main(String[] args) {
		//����ó���� ���ϸ� ���� �߻�
		//findClass();
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	//findClass() �޼��忡�� �߻��� ����(ClassNotFoundException)�� ȣ���� ������ ���ѱ��
	public static void findClass() throws ClassNotFoundException {
		Class c1 = Class.forName("java.lang.String");//ClassNotFoundException �߻�
	}
}
