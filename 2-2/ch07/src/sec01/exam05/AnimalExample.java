package sec01.exam05;

// Animal Ŭ���� ����
class Animal {
	public void move()	{
		System.out.println("������ �����Դϴ�.");
	}
}

//Animal Ŭ������ ����� Human Ŭ���� ����
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�. ");
	}
}

//Animal Ŭ������ ����� Tiger Ŭ���� ����
class Tiger extends Animal{
	@Override
	public void move()	{
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�. ");
	}
}

//Animal Ŭ������ ����� Eagle Ŭ���� ����
class Eagle extends Animal{
	@Override
	public void move()	{
		System.out.println("�������� �ϴ��� ���ϴ� ");
	}
}

//���� Ŭ����
public class AnimalExample {	
	 public static void main(String[] args) {
		 //��ü ����
		 AnimalExample aObj = new AnimalExample();
		 
		 //�� ��ü�� �����Ͽ� moveAnimal() �޼ҵ��� ���ڷ� ����
		 aObj.moveAnimal(new Human());
		 aObj.moveAnimal(new Tiger());
		 aObj.moveAnimal(new Eagle());
	 }

	 /* �Ű� ������ Ÿ����  �θ�(Animal) Ŭ������ ����Ǿ� �ְ�,
	         �Ű�������  Human, Tiger, Eagle Ÿ���� �ڽ� ��ü�� ���� ���޵�
	    - ���� ����� �پ��� ��ü�� ����
	  */
	 public void moveAnimal(Animal animal) { 
		  /* �� �ڽ� ��ü�� �����ǵ� move() �޼ҵ尡 ȣ��Ǿ� �����
		     - �ϳ��� �ڵ尡 �������� Ÿ������ �����Ǿ�  ����� �پ���(������)
		  */
		  animal.move();                     
	 }
}
