package sec01.exam04;

public class VIPCustomer extends Customer{
	int agentID;
	double discountRate;
	
	public VIPCustomer() {
		//super();//부모 클래스의 기본 생성자를 호출
		customerGrade = "VIP";
		mileageRatio = 0.05;
		discountRate = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		mileageRatio = 0.05;
		discountRate = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		mileagePoint += price * mileageRatio;
		return price - (int)(price * discountRate);
	}
	
	public int getAgentID(){
		return agentID;
	}		
}
