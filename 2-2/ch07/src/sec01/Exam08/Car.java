package sec01.Exam08;

public abstract class Car {
	//�߻� �޼��� ����
	public abstract void drive();
	public abstract void stop();
	
	public void startCar()	{
		System.out.println("�õ��� �մϴ�");
	}	
	public  void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	/* ���ø� �޼��� ����
	 - ���α׷� ������ �Ϸ��� ������ ������ �޼���
	 */
	final public void run()	{
		startCar();
		drive();
		stop();
		turnOff();
	}
}
