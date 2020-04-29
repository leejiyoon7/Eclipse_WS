package sec01.exam07;

import java.util.ArrayList;

class Animal{
	public void move(){
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("����� �� �߷� �Ƚ��ϴ�. ");
	}
	
	public void readBook(){
		System.out.println("����� å�� �н��ϴ�. ");
	}
}

class Tiger extends Animal{
	public void move()	{
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�. ");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�. ");
	}
}

class Eagle extends Animal{
	public void move(){
		System.out.println("�������� �ϴ��� ���ϴ� ");
	}
	
	public void flying() {
		System.out.print("�������� ������ �� ��� �ָ� ���ư��ϴ�");
	}
}

//DownCasting Ŭ���� ����
public class DownCasting {
	//�迭�� �ڷ����� Animal ������ ����
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		//������ ���� DownCasting ��ü ����
		DownCasting aTest = new DownCasting();
		//�� ������ �ν��Ͻ��� �����Ͽ� ArrayList�� �߰��ϴ� addAnimal() ȣ��
		aTest.addAnimal();
		
		System.out.println("���� Ÿ������ �ٿ� ĳ���� ");
		//�ٿ� ĳ������ ���� testCasting() ȣ��
		aTest.testCasting();

	}
	
	/* �� ������ �ν��Ͻ��� �����ϸ鼭 Animal ������ ����� �迭�� �߰�
	   - ArrayList�� �߰��Ǵ� �� ������ �ν��Ͻ��� Animal ������ �ڵ� Ÿ�� ��ȯ
	 */
	public void addAnimal()	{
		aniList.add(new Human()); 
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		/*  �迭�� ��ҵ��� Animal������ ������ move() �޼��带  ȣ���ϸ� 
		        �������̵��� move() �޼ҵ尡 ȣ�� ��
		 */
		for(Animal ani : aniList){ 
			ani.move();             
		}
	}

	//�ٿ� ĳ���� �޼ҵ�
	public void testCasting(){
		 //��� �迭 �׸���� �ϳ��� ������ �ٿ� ĳ����
		for(int i=0; i<aniList.size(); i++){ 
			
			// �迭���� ������ ��ü�� Animal Ÿ���� ������ ����
			Animal ani = aniList.get(i); 
			
		    /* ���� ani�� �����ϴ� ��ü�� � ��ü���� ���Ͽ� �ٿ� ĳ����  */
			if(ani instanceof Human){ //Human�̸�
				Human h = (Human)ani; //Human������ �ٿ� ĳ����
				// Human ��ü�� readBook() �޼ҵ� ȣ��
				h.readBook();
			}
			else if(ani instanceof Tiger){ //Tiger ���̸�
				Tiger t = (Tiger)ani;      //Tiger������ �ٿ� ĳ����
				//Tiger ��ü�� hunting() ȣ��
				t.hunting();
			}
			else if(ani instanceof Eagle){//Eagle ���̸�
				Eagle e = (Eagle)ani;     //Eagle ������ �ٿ� ĳ����
				//Eagle ��ü�� flying() �޼ҵ� ȣ��
				e.flying();
			}
			else{
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			}
		}
	}
}





