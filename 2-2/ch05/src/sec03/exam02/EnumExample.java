package sec03.exam02;

public class EnumExample {
	public static void main(String[] args) {
		Week today = Week.MONDAY;
		
		//���� ��� �̸� ��ȯ - name(), toString()
		String name = today.name();
		String name2 = today.toString();
		System.out.println("name:" + name);
		System.out.println("name2:" + name2);
		
		//���� ����� ��ġ�� ��ȯ
		int ordinal = today.ordinal();
		System.out.println("ordinal:" + ordinal);
		
		//�־��� ���� ����� ������� �� ��° ��ġ�ϴ��� ��
		Week day1 = Week.FRIDAY;
		int result = day1.compareTo(today);
		/* today�� �������� �� ��° ��ġ�ϴ��� ��, 
		   - ������ 0, ������ ������ ������, �ڿ� ������ ����� ����
		*/
		System.out.println("result:" + result);
		
		//���ڷ� ������ �̸��� ���� ����� ��ȯ
		Week weekDay = Week.valueOf("FRIDAY");
		System.out.println("weekDay:" + weekDay);
		
		//��� ���� ����� �迭�� ��ȯ
		Week[] days = Week.values();
		for(Week day : days) {
			int ordinal2 =day.ordinal();
			System.out.println("day[" + ordinal2 + "]: "  + day);
		}
	}
}
