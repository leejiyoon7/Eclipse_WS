package sec01.exam04;

public class MemberExample {
	public static void main(String[] args) {
	    Member original = new Member("sony", "�����", "1234", 26, true);
	    
	    //getMember()�� ȣ���Ͽ� ������ ��ü�� ������
        Member clonedObj = original.getMember();
        
        //���� ��ü �ʵ� ���
        System.out.println("������ü:" + original.toString());
        
        //���� ��ü �ʵ� ���
        System.out.println("������ü:" + clonedObj.toString());
        
        //���� ��ü�� password ���� - ���� ��ü�� �н����常 �����
        clonedObj.password = "4321"; 
        System.out.println("������ü �н�����:" + original.password);
        System.out.println("������ü �н�����:" + clonedObj.password );
	}
}
