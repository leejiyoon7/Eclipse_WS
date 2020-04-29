package sec02.exam05;

//실행 클래스
public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기
		account.deposit(100000);
		System.out.println("통장잔고:" + account.getBalance());
		
		//출금하기
		try {
			//account.withdraw(50000);
			account.withdraw(150000);//잔고 부족으로 예외 발생
			System.out.println("통장잔고:" + account.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println("잔고 부족으로 예외발생");
		}		
	}
}
