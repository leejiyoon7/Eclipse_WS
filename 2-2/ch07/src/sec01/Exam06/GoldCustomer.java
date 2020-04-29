package sec01.Exam06;

public class GoldCustomer extends MyCustomer {
	double discountRate;
	
	public GoldCustomer(int customerID, String customerName){
		super(customerID, customerName);
	
		customerGrade = "GOLD";
		mileageRatio = 0.02;
		discountRate = 0.1;	
	}
	
	@Override
	public int calcPrice(int price){
		mileagePoint += price * mileageRatio;
		return price - (int)(price * discountRate);
	}
}
