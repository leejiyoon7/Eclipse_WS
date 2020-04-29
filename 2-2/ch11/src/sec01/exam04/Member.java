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
	
	//��ü�� �����ϰ� �����ϴ� �޼��� 
	public Member getMember() {
        Member clonedObj = null;
        try {
        	//clone() �޼ҵ�� �ڽ�(��ü)�� ����
        	clonedObj = (Member) clone();
        } catch (CloneNotSupportedException e) {}
        //������ ��ü�� ��ȯ
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
