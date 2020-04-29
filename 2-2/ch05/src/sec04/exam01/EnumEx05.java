package sec04.exam01;

//ȸ���� ����� Enum���� ���� 
enum MemberShip2 {
	/* ���� ����� �߰� �Ӽ��� ��ȣ()�� ����
	   - ���� ����� �߰� �Ӽ��� ��ȣ()�� �����ϴ� ��� ���� ���� �����ݷ�(;) �ݵ�� ���� ��
	 */
	PLATINUM_MEMBER(30, 15, "�÷�Ƽ��"), ROYAL_MEMBER(20, 10, "�ξ�"), 
	GOLD_MEMBER(10, 5, "���"), SILVER_MEMBER(5, 1, "�ǹ�");
	
	//���� ����� �߰� �Ӽ� �ʵ�(������) ����
	private int discountRate;
	
	//���� ����� �߰� �Ӽ� �ʵ�(���ϸ���) ����
	private int mileageRate;
	
	//���� ����� �߰� �Ӽ� �ʵ�(���ϸ���) ����
	private String creditRate;
	
	/* ������
	   - ���� ����� �����ڿ� ���� ��üȭ�Ǹ�, �߰� �Ӽ��� ����� ��ü�� �ʵ�� ����(�ʱ�ȭ)
	 */
	private MemberShip2(int discountRate, int mileageRate, String creditRate) {
		this.discountRate = discountRate;
		this.mileageRate = mileageRate;
		this.creditRate = creditRate;
	}
	
	//discountRate�� ��ȯ�ϴ� getDiscountRate() �޼��� ����
	public String getDiscountRate() {
		return discountRate + "%";
	}
	
	//mileageRate�� ��ȯ�ϴ� getMileagetRate() �޼��� ����
	public String getMileageRate() {
		return mileageRate + "%";
	}
	
	//creditRate�� ��ȯ�ϴ� getCreditRate() �޼��� ����
	public String getCreditRate() {
		return creditRate + " ��";
	}
}

public class EnumEx05 {
	public static void main(String[] args) {
		//enum Ÿ�� ������ ��� �Ҵ�
		MemberShip2 grade = MemberShip2.ROYAL_MEMBER;
		
		System.out.println( grade.getCreditRate() + "��!\n" + 
		                    "������ �������� " + grade.getDiscountRate() + "�̰�, " +
		                    "���ϸ��� �������� " + grade.getMileageRate() + "�Դϴ�.");		
	}
}
