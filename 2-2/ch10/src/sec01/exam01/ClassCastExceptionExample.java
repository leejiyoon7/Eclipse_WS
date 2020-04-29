package sec01.exam01;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();		
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}	
	
	public static void changeDog(Animal animal) {
		//Dog dog = (Dog) animal;	
		
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;	
			System.out.println("Dog으로 형변환하였습니다.");
		} if(animal instanceof Cat) {
			Cat cat = (Cat) animal;	
			System.out.println("Cat으로 형변환하였습니다.");
		} else {
			System.out.println("형변환할 수 없습니다.");
		}
	}
}

//class 선언
class Animal {	}
class Dog extends Animal {}
class Cat extends Animal {}
