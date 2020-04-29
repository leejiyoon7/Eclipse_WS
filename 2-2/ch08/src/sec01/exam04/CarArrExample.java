package sec01.exam04;

public class CarArrExample {
	public static void main(String[] args) {
		CarArr myCar = new CarArr();
		myCar.run();
		
		//구현 객체 변경
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		//실행 결과가 달라짐(다형셩)
		myCar.run();
	}	
}
