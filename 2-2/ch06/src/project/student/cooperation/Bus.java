package project.student.cooperation;

public class Bus {
	 int busNumber;             // ���� ��ȣ
	 int passengerCount;        // �°� ��
	 int income;                // ������ ����
	    
	// ������(���� ��ȣ)
	 public Bus(int busNumebr) {   
		  this.busNumber = busNumebr;
	 }
	
	 // �°��� �¿�� �޼ҵ�
	 public void takeOnPassenger(int income) {  
		  this.income += income;    // ������ ���� ����
		  passengerCount++;      // �°� �� ����
	 }
	    
	 // ���� ������ ����ϴ� �޼ҵ�
	 public void showInfo() {      
		  System.out.println("���� " + busNumber + "���� �°��� " + 
	                          passengerCount +"���̰�, ������ " + income + "�Դϴ�.");
	 }
}
