package sec01.exam07;

//수강대상 클래스 선언(일반인)
public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name; 
	}
	
	//Person을 출력하면  name이 출력되도록 재정의
	@Override
	public String toString() {
		return name;
	}
}
