package sec05.exam05;

public class Person {
	// final 필드로 nation, ssn 선언
	final String nation = "Korea";
	final String ssn;//생성자에서 초기화
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
