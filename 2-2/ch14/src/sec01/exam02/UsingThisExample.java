package sec01.exam02;

public class UsingThisExample {
	public static void main(String[] args) {
		//UsingThis ��ü ����
		UsingThis usingThis = new UsingThis();
		
		////UsingThis Ŭ������ inner Ŭ���� ��ü ����
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}

