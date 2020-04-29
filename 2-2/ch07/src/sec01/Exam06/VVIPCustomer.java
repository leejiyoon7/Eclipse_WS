package sec01.Exam06;

public class VVIPCustomer extends MyCustomer {

	private int agentID;
	double discountRate;
	
	public VVIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
	
		customerGrade = "VVIP";
		mileageRatio = 0.05;
		discountRate = 0.2;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price){
		mileagePoint += price * mileageRatio;
		return price - (int)(price * discountRate);
	}
	
	@Override
	public String customerInfo(){
		return super.customerInfo() + " 담당 상담원 번호는 " + agentID + "입니다";  
	}
	
	public int getAgentID(){
		return agentID;
	}
}
