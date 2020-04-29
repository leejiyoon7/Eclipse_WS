package sec01.exam03;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	//같은 이름의 default 메서드가 각 인터페이스에 중복 선언된 경우 재정의해야 함
	@Override
	public void order() {
		System.out.println("고객  주문");
	}
}


