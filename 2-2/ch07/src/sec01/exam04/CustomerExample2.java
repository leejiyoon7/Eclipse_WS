package sec01.exam04;

public class CustomerExample2 {
	public static void main(String[] args) {	
		
		Customer customer_1 = new Customer(1001, "�����");
		int pay = customer_1.calcPrice(100000);		
		System.out.println("���� �ݾ��� " + pay + "�̰�, " + customer_1.customerInfo());
		
		VIPCustomer customer_2 = new VIPCustomer(1002, "�̰���", 101);
		pay = customer_2.calcPrice(100000);
		
		System.out.println("���� �ݾ��� " + pay + "�̰�, " + customer_2.customerInfo());
		
		
		Customer customer_3 = new VIPCustomer(1003, "�̳���", 102);
		pay = customer_3.calcPrice(100000);
		
		System.out.println("���� �ݾ��� " + pay + "�̰�, " + customer_3.customerInfo());

	}
}
