package sec04.exam01;

//회원의 등급을 Enum으로 선언 
enum MemberShip2 {
	/* 열거 상수의 추가 속성을 괄호()로 선언
	   - 열거 상수의 추가 속성을 괄호()로 선언하는 경우 문장 끝에 세미콜론(;) 반드시 찍을 것
	 */
	PLATINUM_MEMBER(30, 15, "플래티늄"), ROYAL_MEMBER(20, 10, "로얄"), 
	GOLD_MEMBER(10, 5, "골드"), SILVER_MEMBER(5, 1, "실버");
	
	//열거 상수의 추가 속성 필드(할인율) 선언
	private int discountRate;
	
	//열거 상수의 추가 속성 필드(마일리지) 선언
	private int mileageRate;
	
	//열거 상수의 추가 속성 필드(마일리지) 선언
	private String creditRate;
	
	/* 생성자
	   - 열거 상수는 생성자에 의해 객체화되며, 추가 속성을 상수별 객체의 필드로 설정(초기화)
	 */
	private MemberShip2(int discountRate, int mileageRate, String creditRate) {
		this.discountRate = discountRate;
		this.mileageRate = mileageRate;
		this.creditRate = creditRate;
	}
	
	//discountRate을 반환하는 getDiscountRate() 메서드 선언
	public String getDiscountRate() {
		return discountRate + "%";
	}
	
	//mileageRate을 반환하는 getMileagetRate() 메서드 선언
	public String getMileageRate() {
		return mileageRate + "%";
	}
	
	//creditRate을 반환하는 getCreditRate() 메서드 선언
	public String getCreditRate() {
		return creditRate + " 고객";
	}
}

public class EnumEx05 {
	public static void main(String[] args) {
		//enum 타입 변수에 상수 할당
		MemberShip2 grade = MemberShip2.ROYAL_MEMBER;
		
		System.out.println( grade.getCreditRate() + "님!\n" + 
		                    "귀하의 할인율은 " + grade.getDiscountRate() + "이고, " +
		                    "마일리지 누적율은 " + grade.getMileageRate() + "입니다.");		
	}
}
