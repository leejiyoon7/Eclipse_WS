package project.student.cooperation;

public class Subway {
	 public String lineNumber;           // ����ö �뼱 ��ȣ
	 public int passengerCount;          // �°� �� 
	 public int income;                   // ���Ծ�
	 
	// ������(����ö �뼱)
	 public Subway(String lineNumber) {   
		  this.lineNumber = lineNumber;   
	 }
	    
	// �°��� �¿�� �޼ҵ�
	 public void takeOnPassenger(int income) {         
		  this.income += income;               // ���� ����
		  passengerCount++;                  // �°� �� ����
	 } 
	 
	// ����ö ������ ����ϴ� �޼ҵ�   
	 public void showInfo() {
		  System.out.println(lineNumber + "�� �°��� " + 
	                         passengerCount +"���̰�, ������ " + income + "�Դϴ�.");
	 }
}
