package project.student.autonumber;

public class StudentExample {

	public static void main(String[] args) {
		// studentSon 학생 객체 생성
		Student studentSon = new Student();
		studentSon.setStudentName("손흥민");
		//serialNum 값 가져오기 위해 get 메서드 호출(클래스 이름으로 직접 호출)
		System.out.println("학번부여 일련번호: " + Student.getSerialNum());  
						
		System.out.println("이름:" + studentSon.studentName + ", 학번:"  
		                           + studentSon.studentID);
		System.out.println();
		
		// studentJo 학생 객체 생성
		Student studentJo = new Student();
		studentJo.setStudentName("조아연");
		System.out.println("학번부여 일련번호: " +Student.getSerialNum());  
		System.out.println("이름:" + studentJo.studentName + ", 학번:" 
		                           + studentJo.studentID);
		
		System.out.println();
		
		// studentKim 학생 객체 생성
		Student studentKim = new Student();
		studentKim.setStudentName("김민아");
		System.out.println("학번부여 일련번호: " +Student.getSerialNum());  
		System.out.println("이름:" + studentKim.studentName + ", 학번:" 
		                           + studentKim.studentID);

	}

}
