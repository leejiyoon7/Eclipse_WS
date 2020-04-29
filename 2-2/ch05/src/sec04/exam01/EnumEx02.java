package sec04.exam01;

//회원의 등급을 인터페이스로 선언 
interface Level {
	int PLATINUM_MEMBER = 1, ROYAL_MEMBER = 2,
	    GOLD_MEMBER = 3,     SILVER_MEMBER = 4;		
}

public class EnumEx02 {	
	public static void main(String[] args) {
		int grade = Level.GOLD_MEMBER;
		int discountRate = 0;
		
		switch(grade) {
		case Level.PLATINUM_MEMBER:
			discountRate = 30; break;
		case Level.ROYAL_MEMBER:
			discountRate = 20; break;
		case Level.GOLD_MEMBER:
			discountRate = 10; break;
		case Level.SILVER_MEMBER:
			discountRate = 5; break;			
		}
		
		System.out.println("귀하는 할인율은 " + discountRate + "입니다.");		
	}
}
