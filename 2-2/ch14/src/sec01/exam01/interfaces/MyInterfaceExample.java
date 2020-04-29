package sec01.exam01.interfaces;

public class MyInterfaceExample {
	
	//MyInterface Ÿ������ �Ű����� ����
	public static void printMethod(MyInterface mi) {
		mi.print();
	}
	
	//MyInterface Ÿ������ ��ȯ�� ����
	public static MyInterface printMethod2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("printMethod2 �޼��忡�� ��ȯ�� MyInterface");
			}
		};
		return mi;
	}
		
	public static void main(String[] args) {
		//����-1(�Ϲ�)
		MyInterfaceImp myInterface1 = new MyInterfaceImp();
		myInterface1.print();
		
		System.out.println("=============");
		
		printMethod(myInterface1);
		
		System.out.println("=============");
		
		//����-2(�͸� Ŭ���� ���)
		MyInterface myInterface2 = new MyInterface() {			
			@Override
			public void print() {
				System.out.println("MyInterface�� �͸� Ŭ������ ����");				
			}
		};
		myInterface2.print();
		
		System.out.println("=============");
		
		printMethod(myInterface2);
		
		System.out.println("=============");
		
		//����-3(�͸� Ŭ���� ��� - ����, ����, ȣ���� �ѹ��� ó�� )
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("MyInterface�� �͸� Ŭ������ ����(����, ����, ȣ���� �ѹ��� ó��)");
			}
		}).print(); // ����, ����, ȣ���� �ѹ��� ó��
		
		System.out.println("=============");
		
		//MyInterface�� ��ȯ�ϴ� �޼��带 ȣ��
		MyInterface mi2 = printMethod2();
		mi2.print(); // printMethod2() �޼��忡�� ��ȯ�� MyInterface
	}
}

