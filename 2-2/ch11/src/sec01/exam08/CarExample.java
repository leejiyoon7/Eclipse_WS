package sec01.exam08;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
			
		//��ü ���� ���(���1)- getClass()
		Class carClass = car.getClass();
			
		System.out.println(carClass.getName());
		System.out.println(carClass.getSimpleName());
		System.out.println(carClass.getPackage().getName());
        System.out.println();	
        
      //��ü ���� ���(���2)- forName()
        try {
        	 Class carClass2 = Class.forName("sec01.exam08.Car");
        	 System.out.println(carClass2.getName());
     		 System.out.println(carClass2.getSimpleName());
     		 System.out.println(carClass2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
