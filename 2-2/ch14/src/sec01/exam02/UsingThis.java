package sec01.exam02;

public class UsingThis {
	int outterField = 10;
	int field = 100;

	//��ø Ŭ���� 
	class Inner {
		int innerField = 20;
		int field = 200;
		
		void method() {
			//���ٽ�
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

