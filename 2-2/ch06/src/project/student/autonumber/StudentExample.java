package project.student.autonumber;

public class StudentExample {

	public static void main(String[] args) {
		// studentSon �л� ��ü ����
		Student studentSon = new Student();
		studentSon.setStudentName("�����");
		//serialNum �� �������� ���� get �޼��� ȣ��(Ŭ���� �̸����� ���� ȣ��)
		System.out.println("�й��ο� �Ϸù�ȣ: " + Student.getSerialNum());  
						
		System.out.println("�̸�:" + studentSon.studentName + ", �й�:"  
		                           + studentSon.studentID);
		System.out.println();
		
		// studentJo �л� ��ü ����
		Student studentJo = new Student();
		studentJo.setStudentName("���ƿ�");
		System.out.println("�й��ο� �Ϸù�ȣ: " +Student.getSerialNum());  
		System.out.println("�̸�:" + studentJo.studentName + ", �й�:" 
		                           + studentJo.studentID);
		
		System.out.println();
		
		// studentKim �л� ��ü ����
		Student studentKim = new Student();
		studentKim.setStudentName("��ξ�");
		System.out.println("�й��ο� �Ϸù�ȣ: " +Student.getSerialNum());  
		System.out.println("�̸�:" + studentKim.studentName + ", �й�:" 
		                           + studentKim.studentID);

	}

}
