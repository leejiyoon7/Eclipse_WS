package sec01.Exam08;

public class TemplateMethodExample {
	public static void main(String[] args) {
		System.out.println("=== �������� �ϴ� �ڵ��� ===");
		Car autoCar = new AutonomousCar();
		autoCar.run();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
