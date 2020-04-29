package sec01.exam02;

public class AnonymousObjectExample {
	public static void main(String[] args) {
		//RemoteControl 인터페이스의 익명 구현 객체 선언
		RemoteControl rc = new RemoteControl() {
			//필드
			private int volume;
			
			//turnOn() 추상 메소드의 구현 메소드
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
				messageInfo("TV 시청이 가능합니다.");
			}	
			//turnOff() 추상 메소드의 구현 메소드
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
				messageInfo("TV 시청이 불가능합니다.");
			}
			//setVolume() 추상 메소드의 구현 메소드
			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨: " + this.volume);
			}
			
			//익명 구현 객체안에서 메서드 선언
			public void messageInfo(String message) {
				System.out.println(message);
			}
		};
		
		//익명 구현 객체의 메서드 호출
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		//익명 구현객체 안에 선언된 멤버는 익명 구현객체 안에서만 사용 가능
		//rc.messageInfo("익명 구현 객체 메서드 호출");
	}//end of main	
}
