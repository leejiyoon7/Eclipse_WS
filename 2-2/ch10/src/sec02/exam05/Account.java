package sec02.exam05;

//계좌 클래스 선언
public class Account {
	//필드
	private long balance;//잔고	
	//생성자
	public Account() {}
	//잔고 확인 getter
	public long getBalance() {
		return balance;
	}
	//예금 메서드
	public void deposit(int money) {
		balance += money;
	}	
	/* 출금 메서드
	     - 메서드를 호출한 곳에서 예외를 처리하도록 예외를 throws
	 */
	public void withdraw(int money) throws BalanceInsufficientException {
		//잔고가 부족하면 예외 발생
		if(balance<money) {
			//예외 발생
			throw new BalanceInsufficientException();
		}
		
		//정상인 경우 출금
		balance -= money;			
	}	
}
