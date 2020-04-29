package sec03.exam02;

enum Month {
	/* ���� ��� ����
	   - ���� ������� ��� �̸��Ӹ� �ƴ϶� �߰� �Ӽ��� �ο��� �� ����
	     ex) LEFT("����"), RIGHT("������")
	   - �������� �Ķ���͸� ���� �߰� �Ӽ��� enum Ŭ������ �ʵ�(field)�� �������ְ�, 
	     getter�޼ҵ�(method)�� ���� �ش� �Ӽ��� �ʿ��� ���� ������ �� �� ����
	   - ��ȣ��(31) ���ڴ� ���� ����� �߰� �Ӽ�
	 */
	JANUARY(31),FEBRUARY(28), MARCH(31), APRIL(30),	MAY(31), JUNE(30),
	JULY(31), AUGUST(31), SEPTEMBER(30),OCTOBER(31),N0VEMBER(30),DECEMBER(31);

	//date �ʵ� ����
	private int date;

	/* ������ ����
	   - enum�� �����ڴ� �ݵ�� private���� �����ؾ� ��
	   - �� ���� ����� ���Ͽ� ȣ��Ǵ� ������
	   - �����ڰ� ȣ��Ǹ� �� ���� ����� �߰� �Ӽ��� ���ڷ� �޾� date �ʵ忡 ����
	 */
	private Month(int date) {
		this.date = date;
	}

	//date�� ��ȯ�ϴ� getDate() �޼��� ����
	int getDate() {
		return date;
	}
}

public class EnumExample2 {
	public static void main(String[] args) {
		//���� ��� ����� Month Ÿ���� �迭�� ��ȯ
		Month list[] = Month.values();
		
		System.out.println("== Month ==");
		for (Month m : list)
			System.out.println(m + ":" + m.getDate());
	}
}
