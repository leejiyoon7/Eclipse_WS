package sec01.exam06;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*12) + 1;
		int day = 0;
		switch(num) {
			case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
		}
		System.out.println(num + "월은 " + day + "일까지 있습니다.");
	}
}
