package sec01.exam04;

public class CarArr {
	//�迭�� �������̽� ���� ��ü ���� 
	Tire[] tires = {
		new HankookTire(),	
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
		//�������̽� Ÿ������ �پ��� ������ü�� �����Ͽ� ���������ν� �پ��� ����� ����(������)
		for(Tire tire: tires) {
			tire.roll();
		}
	}
}
