package sec01.Exam08;

public abstract class Car {
	//추상 메서드 선언
	public abstract void drive();
	public abstract void stop();
	
	public void startCar()	{
		System.out.println("시동을 켭니다");
	}	
	public  void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	/* 템플릿 메서드 선언
	 - 프로그램 실행의 일련의 순서를 정의한 메서드
	 */
	final public void run()	{
		startCar();
		drive();
		stop();
		turnOff();
	}
}
