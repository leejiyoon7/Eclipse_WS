package sec01.exam13;

public class ThreadGroupExample {
	public static void main(String[] args) {
		//������ �׷� ����(main�׷�-myGroup)
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		//������ ����(myGroup�� workThreadA ����) 
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		//������ ����(myGroup�� workThreadB ����)
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		//����(main) �������� �׷� ������ 
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();		
		mainGroup.list();//mainGroup(main�׸�) �׷��� ���� ��� 
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ�� ]");
		myGroup.interrupt();//myGroup �Ҽӵ� ��� �����带 �����ϵ��� �׷쿡�� interrupt() ȣ��
	}
}
