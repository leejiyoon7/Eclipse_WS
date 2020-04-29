package sec01.exam04;

public class CustomerExample2 {
	public static void main(String[] args) {	
		
		Customer customer_1 = new Customer(1001, "손흥민");
		int pay = customer_1.calcPrice(100000);		
		System.out.println("지불 금액은 " + pay + "이고, " + customer_1.customerInfo());
		
		VIPCustomer customer_2 = new VIPCustomer(1002, "이강인", 101);
		pay = customer_2.calcPrice(100000);
		
		System.out.println("지불 금액은 " + pay + "이고, " + customer_2.customerInfo());
		
		
		Customer customer_3 = new VIPCustomer(1003, "이나은", 102);
		pay = customer_3.calcPrice(100000);
		
		System.out.println("지불 금액은 " + pay + "이고, " + customer_3.customerInfo());

	}
}
