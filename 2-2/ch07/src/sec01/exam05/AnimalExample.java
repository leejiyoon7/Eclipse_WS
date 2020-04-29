package sec01.exam05;

// Animal 클래스 선언
class Animal {
	public void move()	{
		System.out.println("동물이 움직입니다.");
	}
}

//Animal 클래스를 상속한 Human 클래스 선언
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다. ");
	}
}

//Animal 클래스를 상속한 Tiger 클래스 선언
class Tiger extends Animal{
	@Override
	public void move()	{
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
}

//Animal 클래스를 상속한 Eagle 클래스 선언
class Eagle extends Animal{
	@Override
	public void move()	{
		System.out.println("독수리가 하늘을 납니다 ");
	}
}

//실행 클래스
public class AnimalExample {	
	 public static void main(String[] args) {
		 //객체 생성
		 AnimalExample aObj = new AnimalExample();
		 
		 //각 객체를 생성하여 moveAnimal() 메소드의 인자로 전달
		 aObj.moveAnimal(new Human());
		 aObj.moveAnimal(new Tiger());
		 aObj.moveAnimal(new Eagle());
	 }

	 /* 매개 변수의 타입이  부모(Animal) 클래스로 선언되어 있고,
	         매개변수에  Human, Tiger, Eagle 타입의 자식 객체가 각각 전달됨
	    - 실행 결과가 다양한 객체를 대입
	  */
	 public void moveAnimal(Animal animal) { 
		  /* 각 자식 객체에 재정의된 move() 메소드가 호출되어 실행됨
		     - 하나의 코드가 여러가지 타입으로 구현되어  결과가 다양함(다형성)
		  */
		  animal.move();                     
	 }
}
