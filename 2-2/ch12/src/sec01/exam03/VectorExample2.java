package sec01.exam03;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {

		//�迭�� ũ�Ⱑ 20�� String Ÿ���� Vector ����
		Vector<String> vector = new Vector<String>(20);

		//addElement() �޼���� ������ �߰�(== add())
		vector.addElement("����");
		vector.addElement("����");
		vector.addElement("����");

		//elementAt() �޼���� ���ڷ� ������ �ε����� �ش��ϴ� �����͸� ��ȯ(== get())
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.elementAt(i) + "\t");
		}

		System.out.println("\n");

		//firstElement()�� ù��° �����͸�, lastElement()�� ������ �����͸� ��ȯ
		System.out.println("1 : " + vector.firstElement());
		System.out.println("2 : " + vector.lastElement());

		//insertElementAt()�� �ι�° ���ڷ� ������ �ε��� ��ġ�� ù��° ���ڰ��� ����
		vector.insertElementAt("�ĸ�", 2);
		print(3, vector);
		
		//setElementAt()�� �ι�° ���ڷ� ������ �ε��� ��ġ�� ù��° ���ڰ��� ����
		vector.setElementAt("����", 1);
		print(4, vector);

		System.out.println("5 : " + vector.capacity());//���� ����ũ��
		System.out.println("6 : " + vector.size());//���;ȿ� ����� �������� ��
		vector.trimToSize();//������ ũ�⸦ �������� ũ��� �����Ͽ�, ������� ���� ������ ����
		System.out.println("7 : " + vector.capacity());
		
		vector.removeElement("����");//���ڷ� ���޵� ������ ����
		print(8, vector);
		vector.removeElementAt(1);//���ڷ� ���޵� �ε����� �ش��ϴ� ������ ����
		print(9, vector);
		vector.removeAllElements();//��� ������ ����(== clear())
		print(10, vector);

		//List ��ü ����
		List<String> list = Arrays.asList("����", "����", "����");
		vector.addAll(list);//���ڷ� ���޵� �÷����� ������(list)���� �߰�
		print(11, vector);
		
		vector.setSize(6);//������ ũ�� ����
		print(12, vector);

	}

	public static void print(int n, List<String> vector) {
		System.out.println(n + " : " + vector);
	}
}
