package sec01.exam04;

//Button 클래스의 OnClickListener 인터페이스를 구현하는 클래스 선언
public class CallListener implements Button.OnClickListener {

	//onClick() 추상 메서드 재정의
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");		
	}
}
