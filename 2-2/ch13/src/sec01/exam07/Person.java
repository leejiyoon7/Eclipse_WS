package sec01.exam07;

//������� Ŭ���� ����(�Ϲ���)
public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name; 
	}
	
	//Person�� ����ϸ�  name�� ��µǵ��� ������
	@Override
	public String toString() {
		return name;
	}
}
