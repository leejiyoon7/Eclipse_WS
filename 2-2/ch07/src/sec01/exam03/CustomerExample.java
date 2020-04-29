package sec01.exam03;

public class CustomerExample {
	public static void main(String[] args) {
		Customer2 customer_1 = new Customer2(1001, "º’»ÔπŒ");
		customer_1.calcPrice(100000);		
		
		System.out.println(customer_1.customerInfo());
	}
}
