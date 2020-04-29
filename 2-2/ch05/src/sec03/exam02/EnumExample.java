package sec03.exam02;

public class EnumExample {
	public static void main(String[] args) {
		Week today = Week.MONDAY;
		
		//열거 상수 이름 반환 - name(), toString()
		String name = today.name();
		String name2 = today.toString();
		System.out.println("name:" + name);
		System.out.println("name2:" + name2);
		
		//열거 상수의 위치값 반환
		int ordinal = today.ordinal();
		System.out.println("ordinal:" + ordinal);
		
		//주어진 열거 상수를 기분으로 몇 번째 위치하는지 비교
		Week day1 = Week.FRIDAY;
		int result = day1.compareTo(today);
		/* today를 기준으로 몇 번째 위치하는지 비교, 
		   - 같으면 0, 이전에 있으면 음수값, 뒤에 있으면 양수값 리턴
		*/
		System.out.println("result:" + result);
		
		//인자로 지정한 이름의 열거 상수를 반환
		Week weekDay = Week.valueOf("FRIDAY");
		System.out.println("weekDay:" + weekDay);
		
		//모든 열거 상수를 배열로 반환
		Week[] days = Week.values();
		for(Week day : days) {
			int ordinal2 =day.ordinal();
			System.out.println("day[" + ordinal2 + "]: "  + day);
		}
	}
}
