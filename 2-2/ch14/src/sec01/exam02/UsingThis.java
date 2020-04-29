package sec01.exam02;

public class UsingThis {
	int outterField = 10;
	int field = 100;

	//중첩 클래스 
	class Inner {
		int innerField = 20;
		int field = 200;
		
		void method() {
			//람다식
			MyFunctionalInterface fi= () -> {
				System.out.println("outterField: " + outterField);				
				System.out.println("innerField: " + innerField);	
		
				int sum = UsingThis.this.field + this.field;				
				System.out.println("sum: " + sum);
			};
			fi.method();
		}
	}
}

