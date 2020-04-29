package sec01.exam03;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEnumerationExample {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(20);
	
		vector.addElement("����");
		vector.addElement("����");
		vector.addElement("����");
	
		// vector ��ü�� ������ �� �ִ� Enumeration ��ü�� ��ȯ
		Enumeration<String> en = vector.elements();
	
		while (en.hasMoreElements()) {
			String city = en.nextElement();
			System.out.println(city);
		}
	
		System.out.println("======");
		
		// vector ��ü�� ������ �� �ִ� Enumeration ��ü�� ��ȯ
		Enumeration<String> en2 = vector.elements();
		//Enumeration ��ü�� Iterator��ü�� ��ȯ
		Iterator<String> iter = en2.asIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
