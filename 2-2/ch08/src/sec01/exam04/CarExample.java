package sec01.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();		
		myCar.run();
		
		//Ÿ�̾� 2���� KumhoTire() ��ü�� ��ȯ
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();		
		myCar.run();
	}
}
