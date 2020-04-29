package sec01.exam04;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int mileagePoint;
	protected double mileageRatio;
	
	//기본 생성자
	public Customer() {
		customerGrade = "SILVER";
		mileageRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	//customerID, customerName를 생성시 반드시 넣을 경우
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.mileageRatio = 0.01;
	}
	
	public int calcPrice(int price){		
		mileagePoint += price * mileageRatio;
		return price;
	}
	
	public String customerInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 마일리지 포인트는 " + 
	                            mileagePoint + "입니다.";  
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

	public int getMileagePoint() {
		return mileagePoint;
	}

	public void setMileagePoint(int mileagePoint) {
		this.mileagePoint = mileagePoint;
	}

	public double getMileageRatio() {
		return mileageRatio;
	}

	public void setMileageRatio(double mileageRatio) {
		this.mileageRatio = mileageRatio;
	}	
}
