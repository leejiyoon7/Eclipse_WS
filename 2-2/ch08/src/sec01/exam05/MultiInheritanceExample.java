package sec01.exam05;

//���� Ŭ������ �̿��ϴ� ���� Ŭ���� �ۼ�
public class MultiInheritanceExample {
	public static void main(String[] args) {
		//���� ��ü ����
		ImplementationC imp = new ImplementationC();
		
		//InterfaceA Ÿ�� ������ ���� ��ü ����
		InterfaceA ia = imp;
		ia.methodA();//methodA�� ȣ�� ����
		System.out.println();
		
		//InterfaceB Ÿ�� ������ ���� ��ü ����
		InterfaceB ib = imp;
		ib.methodB();//methodB�� ȣ�� ����
		System.out.println();
		
		//InterfaceC Ÿ�� ������ ���� ��ü ����
		InterfaceC ic = imp;
		ic.methodA();//��� ȣ�� ����
		ic.methodB();
		ic.methodC();
		System.out.println();
	}
}
