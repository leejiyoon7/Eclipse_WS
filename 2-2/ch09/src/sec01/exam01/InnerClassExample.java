package sec01.exam01;

public class InnerClassExample {
	public static void main(String[] args){
		
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();    // ���� Ŭ���� ��� ȣ��
	    System.out.println();
	    
	    // �ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
		OutClass.InClass inClass = outClass.new InClass();   
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass.inTest();		
		System.out.println();
		
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����(�Ϲ� �޼��� ȣ���� ����)
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();	
	}
}
