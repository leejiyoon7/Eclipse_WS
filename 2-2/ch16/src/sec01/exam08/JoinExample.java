package sec01.exam08;

public class JoinExample {
	public static void main(String[] args) {
		//sumThread todtjd
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		//System.out.println("1~100 ��: " + sumThread.getSum());
		
		try {
			sumThread.join();//sumThread�� ������ �Ϸ�� ������ main ������ �Ͻ�����
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 ��: " + sumThread.getSum());
	}
}

