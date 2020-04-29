package project.student.autonumber;

public class Student {
	//�й� �ڵ� �ο��� ���� �Ϸù�ȣ(static �ʵ�)
	private static int serialNum = 1000;
	int studentID;      //�й�
	String studentName; //�̸�
	
	//������
	public Student(){
		//�л� ��ü�� ������ ������ �Ϸù�ȣ ����
		serialNum++;
		this.studentID = serialNum;//�Ϸù�ȣ�� �й��� ����
	}
	
	//�л� �̸� ��ȯ �޼ҵ�
	public String getStudentName(){
		return studentName;
	}
	
	//�л� �̸� ���� �޼ҵ�
	public void setStudentName(String name){
		this.studentName = name;
	}

	// static �ʵ��� serialNum�� ��ȯ�ϱ� ����  static �޼ҵ� ����
	public static int getSerialNum() {
		return serialNum;
	}
}
