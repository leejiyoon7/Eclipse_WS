package sec01.exam05;

public class Member2Example {
	public static void main(String[] args) {
	    Member2 original = new Member2("�����", 27, new int[] {100, 97}, new Car("���Ͻý�"));
	    
	    //getMember()�� ȣ���Ͽ� ������ ��ü�� ������
        Member2 clonedObj = original.getMember();
        String score= "";
        
        //���� ��ü �ʵ� ���
        System.out.println("������ü:" + original.toString());
        
        //���� ��ü scores �迭 ���        
        for(int i=0; i<original.scores.length; i++) {
        	score += (original.scores[i]+" ");
        }
        System.out.println("scores:" + score);
        
        //���� ��ü Car ��ü �ʵ� ���
        System.out.println("Car Model:" + original.car.model);
        System.out.println();
        
        //���� ��ü�� scores, car �ʵ� ����
        clonedObj.scores[0] = 95;
        clonedObj.scores[1] = 99;
        clonedObj.car = new Car("BMW");
        
        //���� ��ü �ʵ� ���
        System.out.println("������ü:" + clonedObj.toString());
        score= "";
        
        //���� ��ü scores �迭 ���        
        for(int i=0; i<clonedObj.scores.length; i++) {
        	score += (clonedObj.scores[i]+" ");
        }
        System.out.println("scores:" + score);
        
        //�� ��ü Car ��ü �ʵ� ���
        System.out.println("Car Model:" + clonedObj.car.model);
        System.out.println();
	}
}

