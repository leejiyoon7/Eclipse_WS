package sec02.exam02;

public class CarExample {
	public static void main(String[] args) {
		//car 객체 생성
		Car car = new Car("제니시스", "검정");
		
		System.out.println("모델:" + car.model);
		System.out.println("색상:" + car.color);
	}
}
