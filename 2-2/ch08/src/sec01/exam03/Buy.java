package sec01.exam03;

public interface Buy {

	void buy();
	
	default void order(){
		System.out.println("���� �ֹ�");
	}
}



