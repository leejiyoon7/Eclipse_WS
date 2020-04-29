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
			System.out.println("Dog���� ����ȯ�Ͽ����ϴ�.");
		} if(animal instanceof Cat) {
			Cat cat = (Cat) animal;	
			System.out.println("Cat���� ����ȯ�Ͽ����ϴ�.");
		} else {
			System.out.println("����ȯ�� �� �����ϴ�.");
		}
	}
}

//class ����
class Animal {	}
class Dog extends Animal {}
class Cat extends Animal {}
