package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;	
		long var2 = 20L;//long Ÿ������ ǥ��
		
		
		/* �ڹ� �����Ϸ��� ���� ���ͷ��� int Ÿ������ �����ϱ� ������
		   int Ÿ���� �������� �ʰ��ϸ� long Ÿ������ �����Ϸ�����
		     �˷��־����(���ͷ� �ڿ� "L"����)
	    */	
    	//long var3 = 1000000000000; //������ ����(our of range)
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	} 
}

