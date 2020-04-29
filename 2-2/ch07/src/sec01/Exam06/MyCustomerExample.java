package sec01.Exam06;

import java.util.ArrayList;

public class MyCustomerExample {
	public static void main(String[] args) {		
		ArrayList<MyCustomer> customerList = new ArrayList<MyCustomer>();
		
		MyCustomer customer_1 = new MyCustomer(10010, "김인수");
		MyCustomer customer_2 = new MyCustomer(10020, "정인호");
		MyCustomer customer_3 = new GoldCustomer(10030, "이아라");
		MyCustomer customer_4 = new GoldCustomer(10040, "차미란");
		MyCustomer customer_5 = new VVIPCustomer(10050, "최윤", 1077);
		
		customerList.add(customer_1);
		customerList.add(customer_2);
		customerList.add(customer_3);
		customerList.add(customer_4);
		customerList.add(customer_5);
		
		System.out.println("====== 고객 정보 출력 =======");
		
		for( MyCustomer customer : customerList){
			System.out.println(customer.customerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 =======");
		
		int price = 10000;
		for( MyCustomer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() +" 님의 현재 마일리지 포인트는 " 
			                                              + customer.mileagePoint + "점입니다.");
		}
	}
}

