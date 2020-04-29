package sec01.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();		
		myCar.run();
		
		//타이어 2개를 KumhoTire() 객체로 교환
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();		
		myCar.run();
	}
}
