package sec02.exam05;

//���� Ŭ����
public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		//�����ϱ�
		account.deposit(100000);
		System.out.println("�����ܰ�:" + account.getBalance());
		
		//����ϱ�
		try {
			//account.withdraw(50000);
			account.withdraw(150000);//�ܰ� �������� ���� �߻�
			System.out.println("�����ܰ�:" + account.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("�ܰ� �������� ���ܹ߻�");
		}		
	}
}
