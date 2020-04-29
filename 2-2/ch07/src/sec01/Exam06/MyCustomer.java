package sec01.Exam06;

public class MyCustomer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int mileagePoint;
	double mileageRatio;
	
	public MyCustomer()	{
		initCustomer();
	}

	public MyCustomer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		
		initCustomer();
	}
	
	private void initCustomer()	{
		customerGrade = "SILVER";
		mileageRatio = 0.01;	
	}
	
	public int calcPrice(int price){
		mileagePoint += price * mileageRatio;
		return price;
	}
	
	public String customerInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 마일리지 포인트는 " 
	                                      + mileagePoint + "입니다.";  
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
