package sec01.exam03;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEnumerationExample {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(20);
	
		vector.addElement("서울");
		vector.addElement("도쿄");
		vector.addElement("뉴욕");
	
		// vector 객체에 접근할 수 있는 Enumeration 객체를 반환
		Enumeration<String> en = vector.elements();
	
		while (en.hasMoreElements()) {
			String city = en.nextElement();
			System.out.println(city);
		}
	
		System.out.println("======");
		
		// vector 객체에 접근할 수 있는 Enumeration 객체를 반환
		Enumeration<String> en2 = vector.elements();
		//Enumeration 객체를 Iterator객체로 변환
		Iterator<String> iter = en2.asIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
