package sec01.exam03;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	//���� �̸��� default �޼��尡 �� �������̽��� �ߺ� ����� ��� �������ؾ� ��
	@Override
	public void order() {
		System.out.println("��  �ֹ�");
	}
}


