package sec04.exam01;

//ȸ���� ����� Enum ���� ���� 
enum Member {
	PLATINUM_MEMBER, ROYAL_MEMBER, GOLD_MEMBER, SILVER_MEMBER	
}

public class EnumEx03 {
	public static void main(String[] args) {
		//enum Ÿ�� ������ ��� �Ҵ�
		Member grade = Member.GOLD_MEMBER;
		
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
		
		System.out.println("���ϴ� �������� " + discountRate + "�Դϴ�.");		
	}
}
