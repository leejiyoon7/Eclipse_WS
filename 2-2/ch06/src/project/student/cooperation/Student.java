package project.student.cooperation;

public class Student {
	 public String studentName;    // 학생 이름
	 public int tMoney;            // 티모니 교통카드 잔액 
	
	// 생성자(이름,교통카드 전액)
	 public Student(String studentName, int tMoney) {   
		  this.studentName = studentName;
		  this.tMoney = tMoney;
	 }
	 
	 //버스를 타는 메소드(버스 객체를 매개변수로 받음)
	 public void takeBus(Bus bus) {
		  bus.takeOnPassenger(1200);
		  this.tMoney -= 1200;
	 }
	//지하철을 타는 메소드(지하철 객체를 매개변수로 받음)
	 public void takeSubway(Subway subway) {
		  subway.takeOnPassenger(1250);
		  this.tMoney -= 1250;
	 }
	    
	 //학생 정보를 출력하는 메서드
	 public void showInfo() {
		  System.out.println(studentName + 
				             "님의 쿄통카드 잔액은 " + tMoney + "입니다.");
	 }
}
