package sec01.exam04;

public class CarArrExample {
	public static void main(String[] args) {
		CarArr myCar = new CarArr();
		myCar.run();
		
		//���� ��ü ����
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		//���� ����� �޶���(������)
		myCar.run();
	}	
}
