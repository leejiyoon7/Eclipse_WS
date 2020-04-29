package sec02.exam06;

//���� Ŭ���� ����
public class Account {
	//�ʵ�
	private long balance;//�ܰ�	
	//������
	public Account() {}
	//�ܰ� Ȯ�� getter
	public long getBalance() {
		return balance;
	}
	//���� �޼���
	public void deposit(int money) {
		balance += money;
	}	
	/* ��� �޼���
	     - �޼��带 ȣ���� ������ ���ܸ� ó���ϵ��� ���ܸ� throws
	 */
	public void withdraw(int money) throws BalanceInsufficientException {
		//�ܰ� �����ϸ� ���� �߻�
		if(balance<money) {
			//���ܸ� �߻���ų �� ��ü���� ���� �߻� ������ �޽����� ����
			throw new BalanceInsufficientException("�ܰ����(���ܹ߻�):" + (money-balance) + "�� ����");
		}
		
		//������ ��� ���
		balance -= money;			
	}	
}
