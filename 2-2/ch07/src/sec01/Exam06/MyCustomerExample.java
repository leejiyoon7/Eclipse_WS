package sec01.Exam06;

import java.util.ArrayList;

public class MyCustomerExample {
	public static void main(String[] args) {		
		ArrayList<MyCustomer> customerList = new ArrayList<MyCustomer>();
		
		MyCustomer customer_1 = new MyCustomer(10010, "���μ�");
		MyCustomer customer_2 = new MyCustomer(10020, "����ȣ");
		MyCustomer customer_3 = new GoldCustomer(10030, "�̾ƶ�");
		MyCustomer customer_4 = new GoldCustomer(10040, "���̶�");
		MyCustomer customer_5 = new VVIPCustomer(10050, "����", 1077);
		
		customerList.add(customer_1);
		customerList.add(customer_2);
		customerList.add(customer_3);
		customerList.add(customer_4);
		customerList.add(customer_5);
		
		System.out.println("====== �� ���� ��� =======");
		
		for( MyCustomer customer : customerList){
			System.out.println(customer.customerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� =======");
		
		int price = 10000;
		for( MyCustomer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" ���� " +  + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() +" ���� ���� ���ϸ��� ����Ʈ�� " 
			                                              + customer.mileagePoint + "���Դϴ�.");
		}
	}
}

