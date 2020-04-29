package project.student.cooperation;

public class Bus {
	 int busNumber;             // 버스 번호
	 int passengerCount;        // 승객 수
	 int income;                // 버스의 수입
	    
	// 생성자(버스 번호)
	 public Bus(int busNumebr) {   
		  this.busNumber = busNumebr;
	 }
	
	 // 승객을 태우는 메소드
	 public void takeOnPassenger(int income) {  
		  this.income += income;    // 버스의 수입 증가
		  passengerCount++;      // 승객 수 증가
	 }
	    
	 // 버스 정보를 출력하는 메소드
	 public void showInfo() {      
		  System.out.println("버스 " + busNumber + "번의 승객은 " + 
	                          passengerCount +"명이고, 수입은 " + income + "입니다.");
	 }
}
