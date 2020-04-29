package sec01.exam01;

public class Student {
	//필드
	private int id;
	private String name;
	
	//생성자
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//메서드
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
