package sec01.Exam08;

public class TemplateMethodExample {
	public static void main(String[] args) {
		System.out.println("=== 자율주행 하는 자동차 ===");
		Car autoCar = new AutonomousCar();
		autoCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
