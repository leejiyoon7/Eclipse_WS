package sec04.exam01;

//ȸ���� ����� Enum���� ���� 
enum MemberShip {
	/* ���� ����� �߰� �Ӽ��� ��ȣ()�� ����
	   - ���� ����� �߰� �Ӽ��� ��ȣ()�� �����ϴ� ��� ���� ���� �����ݷ�(;) �ݵ�� ���� ��
	 */
	PLATINUM_MEMBER(30), ROYAL_MEMBER(20), GOLD_MEMBER(10), SILVER_MEMBER(5);
	
	//���� ����� �߰� �Ӽ� �ʵ�(������) ����
	private int discountRate;
			
	/* ������
	   - ���� ����� �����ڿ� ���� ��üȭ�Ǹ�, �߰� �Ӽ��� ����� ��ü�� �ʵ�� ����(�ʱ�ȭ)
	 */
	private MemberShip(int discountRate) {
		this.discountRate = discountRate;
		System.out.println("������ ȣ��:" + this);
	}
	
	//discountRate�� ��ȯ�ϴ� getDiscountRate() �޼��� ����
	public String getDiscountRate() {
		return discountRate + "%";
	}
}

public class EnumEx04 {
	public static void main(String[] args) {
		//enum Ÿ�� ������ ��� �Ҵ�
		MemberShip grade = MemberShip.GOLD_MEMBER;
		
		System.out.println("���ϴ� �������� " + grade.getDiscountRate() + "�Դϴ�.");		
	}
}
