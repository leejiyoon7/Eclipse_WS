package sec01.exam03;

public class UsingLocalVariable {
	
	public void getValue(int arg) {  
		int var = 20; 	
		// ���ú����� ���ٽĿ��� final Ư���� ����
		//arg = 100;  	//final Ư�� ������ ���� �Ұ�
		//var = 200; 	//final Ư�� ������ ���� �Ұ�
        
		//���ٽ�
		MyFunctionalInterface fi= () -> {
			//���ú��� ���
			System.out.println("arg: " + arg); 
			System.out.println("var: " + var + "\n");
		};
		fi.method();
	}
}

