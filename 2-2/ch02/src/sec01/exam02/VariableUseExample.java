package sec01.exam02;

public class VariableUseExample {
	public static void main(String[] args) {
		//변수 선언
		int hour = 3;
		int minute = 5;
		
		//출력
		System.out.println(hour + "시간 " + minute + "분");

		//연산
		int totalMinute = (hour*60) + minute;
		//출력
		System.out.println("총 " + totalMinute + "분");
	}
}

