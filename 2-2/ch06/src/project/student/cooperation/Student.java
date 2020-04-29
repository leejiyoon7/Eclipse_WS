package project.student.cooperation;

public class Student {
	 public String studentName;    // �л� �̸�
	 public int tMoney;            // Ƽ��� ����ī�� �ܾ� 
	
	// ������(�̸�,����ī�� ����)
	 public Student(String studentName, int tMoney) {   
		  this.studentName = studentName;
		  this.tMoney = tMoney;
	 }
	 
	 //������ Ÿ�� �޼ҵ�(���� ��ü�� �Ű������� ����)
	 public void takeBus(Bus bus) {
		  bus.takeOnPassenger(1200);
		  this.tMoney -= 1200;
	 }
	//����ö�� Ÿ�� �޼ҵ�(����ö ��ü�� �Ű������� ����)
	 public void takeSubway(Subway subway) {
		  subway.takeOnPassenger(1250);
		  this.tMoney -= 1250;
	 }
	    
	 //�л� ������ ����ϴ� �޼���
	 public void showInfo() {
		  System.out.println(studentName + 
				             "���� ����ī�� �ܾ��� " + tMoney + "�Դϴ�.");
	 }
}
