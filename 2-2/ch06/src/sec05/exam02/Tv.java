package sec05.exam02;

public class Tv {
	static String company = "SAMSUNG";
	static String model = "QLED 8K";
	static String size = "75��ġ";
	static String info;	
	static int discountPrice;	
	
	//static ��� ����
	static {
		info = company + " - " + model + "(" + size + ")"; 
		
		//discountPrice ���
		int price = 0;
		for(int i=0; i<=75; i++) {
			price += (i * 5500);
		}		
		discountPrice = price;
	}
}
