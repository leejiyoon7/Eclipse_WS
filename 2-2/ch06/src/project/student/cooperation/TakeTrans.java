package project.student.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// �� ���� �л� ��ü ����
		  Student james = new Student("James", 5000);   
		  Student tomas = new Student("Tomas", 10000);
		  
		  james.showInfo();   // james ���� ���
		  tomas.showInfo();   // Tomas ���� ���
		  System.out.println("===================");
		  
		  //100�� ���� ��ü ����
		  Bus bus100 = new Bus(100);
		  
		  // james�� 100�� ���� ź ���
		  james.takeBus(bus100);     
		  james.showInfo();   // james ���� ���
		  bus100.showInfo();  // 100�� ���� ���� ���
		  System.out.println("===================");
		
		  //2ȣ�� ����ö ��ü ����
		  Subway subway2 = new Subway("2ȣ��");  
		  
		  // Tomas�� 2ȣ�� ����ö�� ź ���
		  tomas.takeSubway(subway2); 
		  tomas.showInfo();   // Tomas ���� ���
		  subway2.showInfo(); // 2ȣ�� ����ö ���� ��� 
	}
}
