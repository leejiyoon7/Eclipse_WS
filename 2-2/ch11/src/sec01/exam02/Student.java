package sec01.exam02;

public class Student {
	//필드
	private int studentID;
	private String studentName;
		
	//생성자
	public Student(int studentID, String studentNmae) {
		this.studentID = studentID;
		this.studentName = studentNmae;		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			//학번과 이름이 같으면 true 반환
			if((this.studentID == std.studentID)
				&& (this.studentName.contentEquals(std.studentName))) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	/* hashCode() 재정의 - 두 객체의 동등성을 부여하기 위함
	 * - 두 학생 객체가 논리적으로 동등하면 동일한 해시코드를 생성하여  리턴하도록 구현	  
	 * - 학번이 같으면 동일한 학생이므로 학번으로 해시코드 반환
	 */
	@Override
	public int hashCode() {
		//return this.studentID;//학번으로 해시코드 반환
		
		String str = "" + this.studentID;//학번을 문자열로 변환하여 해시코드 생성
		return str.hashCode();
	}
}
