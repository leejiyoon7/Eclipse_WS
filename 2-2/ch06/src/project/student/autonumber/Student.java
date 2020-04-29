package project.student.autonumber;

public class Student {
	//학번 자동 부여를 위한 일련번호(static 필드)
	private static int serialNum = 1000;
	int studentID;      //학번
	String studentName; //이름
	
	//생성자
	public Student(){
		//학생 객체를 생성할 때마다 일련번호 증가
		serialNum++;
		this.studentID = serialNum;//일련번호를 학번에 대입
	}
	
	//학생 이름 반환 메소드
	public String getStudentName(){
		return studentName;
	}
	
	//학생 이름 설정 메소드
	public void setStudentName(String name){
		this.studentName = name;
	}

	// static 필드인 serialNum를 반환하기 위한  static 메소드 선언
	public static int getSerialNum() {
		return serialNum;
	}
}
