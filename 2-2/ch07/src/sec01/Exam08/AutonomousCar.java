package sec01.Exam08;

public class AutonomousCar extends Car {

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�");
		System.out.println("�ڵ����� ������ ������ ��ȯ�մϴ�.");		
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");		
	}
}
