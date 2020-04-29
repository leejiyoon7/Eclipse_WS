package sec01.exam03;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {

		//배열의 크기가 20인 String 타입의 Vector 생성
		Vector<String> vector = new Vector<String>(20);

		//addElement() 메서드로 데이터 추가(== add())
		vector.addElement("서울");
		vector.addElement("도쿄");
		vector.addElement("뉴욕");

		//elementAt() 메서드는 인자로 전달한 인덱스에 해당하는 데이터를 반환(== get())
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.elementAt(i) + "\t");
		}

		System.out.println("\n");

		//firstElement()는 첫번째 데이터를, lastElement()는 마지막 데이터를 반환
		System.out.println("1 : " + vector.firstElement());
		System.out.println("2 : " + vector.lastElement());

		//insertElementAt()는 두번째 인자로 전달한 인덱스 위치에 첫번째 인자값을 삽입
		vector.insertElementAt("파리", 2);
		print(3, vector);
		
		//setElementAt()는 두번째 인자로 전달한 인덱스 위치에 첫번째 인자값을 설정
		vector.setElementAt("런던", 1);
		print(4, vector);

		System.out.println("5 : " + vector.capacity());//현재 벡터크기
		System.out.println("6 : " + vector.size());//벡터안에 저장된 데이터의 수
		vector.trimToSize();//벡터의 크기를 데이터의 크기로 변경하여, 저장되지 않은 공간을 삭제
		System.out.println("7 : " + vector.capacity());
		
		vector.removeElement("뉴욕");//인자로 전달된 데이터 삭제
		print(8, vector);
		vector.removeElementAt(1);//인자로 전달된 인덱스에 해당하는 데이터 삭제
		print(9, vector);
		vector.removeAllElements();//모든 데이터 삭제(== clear())
		print(10, vector);

		//List 객체 생성
		List<String> list = Arrays.asList("서울", "도쿄", "뉴욕");
		vector.addAll(list);//인자로 전달된 컬렉션의 데이터(list)들을 추가
		print(11, vector);
		
		vector.setSize(6);//벡터의 크기 변경
		print(12, vector);

	}

	public static void print(int n, List<String> vector) {
		System.out.println(n + " : " + vector);
	}
}
