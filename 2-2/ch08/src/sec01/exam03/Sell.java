package sec01.exam03;

public interface Sell {
	
	void sell();
	
	default void order(){
		System.out.println("�Ǹ� �ֹ�");
	}
}



