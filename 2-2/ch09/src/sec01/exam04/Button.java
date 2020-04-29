package sec01.exam04;

public class Button {
	//필드 선언
	OnClickListener listener;//내부 인터페이스 타입으로 선언
	
	//메소드 선언
	//OnClickListener 인터페이스를 구현한 다양한 구현 객체를 인자로 받을 수 있도록 매개변수 선언(다형성)
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		//button을 터치하면 구현 객체의 onClick()메서드 호출
		listener.onClick();
	}

	/* 내부 인터페이스 선언
	 * 내부인터페이스(OnClickListener)는 Button class에서 이벤트 처리를 위해 사용
	 */
	static interface OnClickListener {
		//추상 메서드 선언
		void onClick();
	}	
}
