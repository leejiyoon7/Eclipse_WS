package sec04.exam01;

public class EnumEx01 {
	//ȸ���� ����� ���� ����� ����
	public static final int PLATINUM_MEMBER = 1;
	public static final int ROYAL_MEMBER = 2;
	public static final int GOLD_MEMBER = 3;
	public static final int SILVER_MEMBER = 4;
		
	public static void main(String[] args) {
		int grade = GOLD_MEMBER;
		int discountRate = 0;
		
		switch(grade) {
		case PLATINUM_MEMBER:
			discountRate = 30; break;
		case ROYAL_MEMBER:
			discountRate = 20; break;
		case GOLD_MEMBER:
			discountRate = 10; break;
		case SILVER_MEMBER:
			discountRate = 5; break;			
		}
		
		System.out.println("���ϴ� �������� " + discountRate + "%�Դϴ�.");		
	}
}
