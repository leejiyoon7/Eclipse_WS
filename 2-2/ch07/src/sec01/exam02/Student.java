package sec01.exam02;

public class Student extends Person{
	public int stdNo;
	
	public Student(String name, String ssn, int stdNo) {
		super(name, ssn);
		
		this.stdNo = stdNo;
		
		System.out.println("Student °´Ã¼ »ý¼º");
	}
}
