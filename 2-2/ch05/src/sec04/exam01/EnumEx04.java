package sec04.exam01;

//회원의 등급을 Enum으로 선언 
enum MemberShip {
	/* 열거 상수의 추가 속성을 괄호()로 선언
	   - 열거 상수의 추가 속성을 괄호()로 선언하는 경우 문장 끝에 세미콜론(;) 반드시 찍을 것
	 */
	PLATINUM_MEMBER(30), ROYAL_MEMBER(20), GOLD_MEMBER(10), SILVER_MEMBER(5);
	
	//열거 상수의 추가 속성 필드(할인율) 선언
	private int discountRate;
			
	/* 생성자
	   - 열거 상수는 생성자에 의해 객체화되며, 추가 속성을 상수별 객체의 필드로 설정(초기화)
	 */
	private MemberShip(int discountRate) {
		this.discountRate = discountRate;
		System.out.println("생성자 호출:" + this);
	}
	
	//discountRate을 반환하는 getDiscountRate() 메서드 선언
	public String getDiscountRate() {
		return discountRate + "%";
	}
}

public class EnumEx04 {
	public static void main(String[] args) {
		//enum 타입 변수에 상수 할당
		MemberShip grade = MemberShip.GOLD_MEMBER;
		
		System.out.println("귀하는 할인율은 " + grade.getDiscountRate() + "입니다.");		
	}
}
