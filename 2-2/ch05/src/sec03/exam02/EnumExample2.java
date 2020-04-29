package sec03.exam02;

enum Month {
	/* 열거 상수 선언
	   - 열거 상수에는 상수 이름뿐만 아니라 추가 속성을 부여할 수 있음
	     ex) LEFT("왼쪽"), RIGHT("오른쪽")
	   - 생성자의 파라미터를 통해 추가 속성을 enum 클래스의 필드(field)에 설정해주고, 
	     getter메소드(method)를 통해 해당 속성을 필요할 때에 가져다 쓸 수 있음
	   - 괄호안(31) 숫자는 월별 상수의 추가 속성
	 */
	JANUARY(31),FEBRUARY(28), MARCH(31), APRIL(30),	MAY(31), JUNE(30),
	JULY(31), AUGUST(31), SEPTEMBER(30),OCTOBER(31),N0VEMBER(30),DECEMBER(31);

	//date 필드 선언
	private int date;

	/* 생성자 선언
	   - enum의 생성자는 반드시 private으로 선언해야 함
	   - 각 열거 상수에 대하여 호출되는 생성자
	   - 생성자가 호출되면 각 열거 상수의 추가 속성을 인자로 받아 date 필드에 설정
	 */
	private Month(int date) {
		this.date = date;
	}

	//date를 반환하는 getDate() 메서드 선언
	int getDate() {
		return date;
	}
}

public class EnumExample2 {
	public static void main(String[] args) {
		//열거 상수 목록을 Month 타입의 배열로 반환
		Month list[] = Month.values();
		
		System.out.println("== Month ==");
		for (Month m : list)
			System.out.println(m + ":" + m.getDate());
	}
}
