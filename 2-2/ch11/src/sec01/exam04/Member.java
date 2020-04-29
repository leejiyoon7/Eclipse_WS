package sec01.exam04;

public class Member implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;
    
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	//객체를 복제하고 리턴하는 메서드 
	public Member getMember() {
        Member clonedObj = null;
        try {
        	//clone() 메소드로 자신(객체)을 복제
        	clonedObj = (Member) clone();
        } catch (CloneNotSupportedException e) {}
        //복제된 객체를 반환
        return clonedObj;
    }
	
	@Override
	public String toString() {		
		String objField = getClass().getSimpleName() +
		     "[id:" + this.id + ", name:" + this.name +
		     ", password:" + this.password + ", age:" + this.age +
		     ", adult:" + this.adult + "]";
		return objField;
	}
}
