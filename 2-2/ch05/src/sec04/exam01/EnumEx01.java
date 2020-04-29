package sec04.exam01;

public class EnumEx01 {
	//회원의 등급을 정적 상수로 선언
	public static final int PLATINUM_MEMBER = 1;
	public static final int ROYAL_MEMBER = 2;
	public static final int GOLD_MEMBER = 3;
	public static final int SILVER_MEMBER = 4;
		
	public static void main(String[] args) {
		int grade = GOLD_MEMBER;
		int discountRate = 0;
		
		switch(grade) {
		case PLATINUM_MEMBER:
			discountRate = 30; break;
		case ROYAL_MEMBER:
			discountRate = 20; break;
		case GOLD_MEMBER:
			discountRate = 10; break;
		case SILVER_MEMBER:
			discountRate = 5; break;			
		}
		
		System.out.println("귀하는 할인율은 " + discountRate + "%입니다.");		
	}
}
