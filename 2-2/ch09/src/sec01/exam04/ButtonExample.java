package sec01.exam04;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		//버튼 이벤트 처리 - 전화걸기
		btn.setOnClickListener(new CallListener());
		btn.touch();		
		//버튼 이벤트 처리 - 메시지 보내기
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		//익명 구현 객체를 생성하여 이벤트 처리하는 방법- 주로 사용
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");				
			}
		});
		btn.touch();		
	}
}
