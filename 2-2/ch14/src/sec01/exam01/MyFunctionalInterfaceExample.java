package sec01.exam01;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		//�������̽� MyFunctionalInterface Ÿ���� �����ϴ� ��������
		MyFunctionalInterface fi;
		
		//���ٽ��� �ۼ��Ͽ� �������̽� ������ ����
		fi= () -> { 
			String str = "method ȣ��(1)";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> { System.out.println("method ȣ��(2)"); };
		fi.method();
		
		fi = () -> System.out.println("method ȣ��(3)");
		fi.method();
	}
}











