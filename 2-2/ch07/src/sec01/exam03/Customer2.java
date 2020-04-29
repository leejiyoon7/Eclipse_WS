package sec01.exam03;

//�浹�� Customer => Customer2�� �ӽ� ����
public class Customer2 {
	private int customerID;
	private String customerName;
	private String customerGrade;
	private int mileagePoint;
	private double mileageRatio;
	
	public Customer2(int customerID, String customerName){
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
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ϸ��� ����Ʈ�� " + 
	                            mileagePoint + "�Դϴ�.";  
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
