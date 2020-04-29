package sec01.exam02;

public class Student {
	//�ʵ�
	private int studentID;
	private String studentName;
		
	//������
	public Student(int studentID, String studentNmae) {
		this.studentID = studentID;
		this.studentName = studentNmae;		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			//�й��� �̸��� ������ true ��ȯ
			if((this.studentID == std.studentID)
				&& (this.studentName.contentEquals(std.studentName))) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	/* hashCode() ������ - �� ��ü�� ����� �ο��ϱ� ����
	 * - �� �л� ��ü�� �������� �����ϸ� ������ �ؽ��ڵ带 �����Ͽ�  �����ϵ��� ����	  
	 * - �й��� ������ ������ �л��̹Ƿ� �й����� �ؽ��ڵ� ��ȯ
	 */
	@Override
	public int hashCode() {
		//return this.studentID;//�й����� �ؽ��ڵ� ��ȯ
		
		String str = "" + this.studentID;//�й��� ���ڿ��� ��ȯ�Ͽ� �ؽ��ڵ� ����
		return str.hashCode();
	}
}
