package sec02.exam05;

/* ����� ���� �ܰ���� ���� Ŭ���� ����
   - ���� ������ ���� �Ϲ� ����(Exception) �Ǵ� ���� ����(RuntimeException)�� ��� 
 */
public class BalanceInsufficientException extends Exception {

	//�⺻ ������
	public BalanceInsufficientException() { }
	/* ���� �߻� �޽����� �����ϴ� ���� ��ü�� ����� ���� ������
	   - �������� �Ű������� ���� ��Ȳ �޽����� ����
	 */
	public BalanceInsufficientException(String message) {
		/* super(message)�� ����Ͽ� ���� �޽����� ����
		   - ���� �߻� �޽����� ���� Ŭ���� �����ڸ� ȣ���Ͽ� ����
		 */
		super(message);	
	}	
}

