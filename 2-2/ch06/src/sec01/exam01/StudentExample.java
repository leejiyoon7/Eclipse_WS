package sec01.exam01;

public class StudentExample {
	public static void main(String[] args) {
		//��ü ����
		Student stdSon = new Student(20183301, "�����");
		Student stdKim = new Student(20183302, "��ξ�");
		
		//��ü ���
		System.out.println("=== �л� ��� ===");
		System.out.println("�й�:" + stdSon.getId() + ", �̸�:" + stdSon.getName());
		System.out.println("�й�:" + stdKim.getId() + ", �̸�:" + stdKim.getName());
	}
}
