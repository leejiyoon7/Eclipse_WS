package sec04.exam01;

//회원의 등급을 Enum 으로 선언 
enum Member {
	PLATINUM_MEMBER, ROYAL_MEMBER, GOLD_MEMBER, SILVER_MEMBER	
}

public class EnumEx03 {
	public static void main(String[] args) {
		//enum 타입 변수에 상수 할당
		Member grade = Member.GOLD_MEMBER;
		
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
		
		System.out.println("귀하는 할인율은 " + discountRate + "입니다.");		
	}
}
