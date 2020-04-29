package sec02.exam06;

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
			//예외 정보 얻기
			System.out.println(e.getMessage());
			System.out.println();
			
			System.out.println(e.toString());
			System.out.println();
			
			//상세 예외  정보 출력
			System.out.print("예외발생 정보: ");
			e.printStackTrace();		
		}		
	}
}
