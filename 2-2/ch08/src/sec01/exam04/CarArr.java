package sec01.exam04;

public class CarArr {
	//배열로 인터페이스 구현 객체 관리 
	Tire[] tires = {
		new HankookTire(),	
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
		//인터페이스 타입으로 다양한 구현객체를 대입하여 실행함으로써 다양한 결과를 얻음(다형성)
		for(Tire tire: tires) {
			tire.roll();
		}
	}
}
