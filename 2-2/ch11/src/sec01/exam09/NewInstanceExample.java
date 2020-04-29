package sec01.exam09;

public class NewInstanceExample {
	public static void main(String[] args) {
		String className=null;
		
		try {
			// args[] �Ű������� ���� ���� Ŭ���� ���� 
			if(args[0].equals("0")) {
				className = "sec01.exam09.SendAction";
			} else {
				className = "sec01.exam09.ReceiveAction";
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}		
		
		try {
			//Class ��ü ����
			Class obj = Class.forName(className);
			System.out.println(obj.toString());
			
			/* Class ��ü�� newInstance() �޼ҵ�� Object ��ü�� �������� ����
			 - newInstance() �޼ҵ�� �⺻ �����ڸ� ȣ���ؼ� ��ü�� �����ϱ� ������ 
			   getDeclaredConstructor() �޼ҵ�� �����ڸ� ȣ��
			 - �������� ������ ��ü�� ��� Action �������̽��� �����ϰ� �ֱ� ������
			   Action �������̽� Ÿ������ ���� Ÿ�� ��ȯ�� ����(newInstance() �޼ҵ��� ���� Ÿ���� Object)*/
			Action action = (Action) obj.getDeclaredConstructor().newInstance();
			
			/*Action �������̽��� execute() �޼ҵ带 ȣ���ϸ�, ���� Ŭ������ �����ǵ� execute() �޼ҵ尡 ����*/
			action.execute();
		} catch (Exception e) {			
			System.out.println(e);
		}		
	}
}
