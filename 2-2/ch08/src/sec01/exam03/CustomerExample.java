package sec01.exam03;

public class CustomerExample {

	public static void main(String[] args) {
		//��ü ����
		Customer customer = new Customer();
		
		/* ������ ��ü�� � Ÿ���� ������ ���ε�(����)�ϴ��Ŀ� ���� 
		      ȣ���� �� �ִ� �޼���� �޶���. */
		
		/* customer ��ü�� Buy �������̽� Ÿ���� buyer�� �����Ͽ�
		      �� ��ȯ�ϸ�, buyer�� Buy �������̽��� �޼��常 ȣ���� �� ����		   
		*/
		Buy buyer = customer;
		buyer.buy();
		buyer.order();//�����ǵ� order()�� ȣ���
		
		/* customer ��ü�� Sell �������̽� Ÿ���� seller�� �����Ͽ�
	              �� ��ȯ�ϸ�, seller�� Sell �������̽��� �޼��常 ȣ���� �� ����		   
		*/
		Sell seller = customer;
		seller.sell();
		seller.order();//�����ǵ� order()�� ȣ���
		
		//Sell���� seller�� Customer ������ �ٿ� ĳ����
		if( seller instanceof Customer){
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			customer2.order();//�����ǵ� order()�� ȣ���
		}		
		customer.order();//�����ǵ� order()�� ȣ���
	}
}


