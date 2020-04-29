package sec01.exam01;

public class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass(); // ���� Ŭ���� ����
	}
	
	//���� Ŭ���� ����
	class InClass{
		
		int inNum = 100;
		//static int sInNum = 200;  //static ���� ����Ұ�
		
		void inTest(){
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			inNum += num;
			System.out.println("InClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}		
	    //static void sTest(){ }  //static �޼��� ����Ұ�		
	}//end of InClass
	
	public void usingClass(){
		inClass.inTest(); //���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ�
	}
	
	//static ���� Ŭ���� ����
	static class InStaticClass{		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest(){   //���� Ŭ������ �Ϲ� �޼���
			//num += 10;    // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
		}
		
		static void sTest(){  // ���� Ŭ������ static �޼���
			//num += 10;   // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			//inNum += 10; // ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
			
		}
	}//end of InStaticClass	
}

