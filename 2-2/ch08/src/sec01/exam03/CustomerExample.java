package sec01.exam03;

public class CustomerExample {

	public static void main(String[] args) {
		//객체 생성
		Customer customer = new Customer();
		
		/* 생성된 객체를 어떤 타입의 변수에 바인딩(대입)하느냐에 따라 
		      호출할 수 있는 메서드는 달라짐. */
		
		/* customer 객체를 Buy 인터페이스 타입의 buyer에 대입하여
		      형 변환하면, buyer는 Buy 인터페이스의 메서드만 호출할 수 있음		   
		*/
		Buy buyer = customer;
		buyer.buy();
		buyer.order();//재정의된 order()가 호출됨
		
		/* customer 객체를 Sell 인터페이스 타입의 seller에 대입하여
	              형 변환하면, seller는 Sell 인터페이스의 메서드만 호출할 수 있음		   
		*/
		Sell seller = customer;
		seller.sell();
		seller.order();//재정의된 order()가 호출됨
		
		//Sell형인 seller를 Customer 형으로 다운 캐스팅
		if( seller instanceof Customer){
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			customer2.order();//재정의된 order()가 호출됨
		}		
		customer.order();//재정의된 order()가 호출됨
	}
}


