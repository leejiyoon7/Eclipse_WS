package sec01.exam04;

public class CustomerExample {
	public static void main(String[] args) {
		
		Customer customer_1 = new Customer();
		customer_1.setCustomerID(1001);
		customer_1.setCustomerName("º’»ÔπŒ");		
		customer_1.mileagePoint = 10000;
		
		VIPCustomer customer_2 = new VIPCustomer();
//		Customer customer_2 = new VIPCustomer();
		customer_2.setCustomerID(1002);
		customer_2.setCustomerName("¿Ã∞≠¿Œ");	
		customer_2.mileagePoint = 20000;
		
		System.out.println(customer_1.customerInfo());
		System.out.println(customer_2.customerInfo());

	}	
}
