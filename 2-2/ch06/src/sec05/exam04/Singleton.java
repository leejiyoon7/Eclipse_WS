package sec05.exam04;

public class Singleton {
	/* 2)�ڽ��� Ŭ���� Ÿ������ ����(static)�ʵ带 �����ϰ� �ڽ��� �ν��Ͻ��� �����Ͽ� �ʱ�ȭ
	   - ������ ���� �ʵ带 �ܺο��� ������� ���ϵ���  ���������ڸ� private�� ����
	*/
	private static Singleton singleton = new Singleton();
	
	/* 1) �����ڸ� private�� ����
	   - �ܺο��� Singleton �ν��Ͻ��� ������ �� ������ �ϱ� ����
	*/
	private Singleton() {}
	
	/* 3) ������ �ν��Ͻ��� �ܺο��� ����� �� �ֵ��� getInstance() ����
	   - �����ϰ� ������ �ν��Ͻ��� �ܺο��� ����� �� �ֵ��� ��ȯ 
	 */
	public static Singleton getInstance() {
		return singleton;
	}
}


