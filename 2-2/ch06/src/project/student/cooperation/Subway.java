package project.student.cooperation;

public class Subway {
	 public String lineNumber;           // 지하철 노선 번호
	 public int passengerCount;          // 승객 수 
	 public int income;                   // 수입액
	 
	// 생성자(지하철 노선)
	 public Subway(String lineNumber) {   
		  this.lineNumber = lineNumber;   
	 }
	    
	// 승객을 태우는 메소드
	 public void takeOnPassenger(int income) {         
		  this.income += income;               // 수입 증가
		  passengerCount++;                  // 승객 수 증가
	 } 
	 
	// 지하철 정보를 출력하는 메소드   
	 public void showInfo() {
		  System.out.println(lineNumber + "의 승객은 " + 
	                         passengerCount +"명이고, 수입은 " + income + "입니다.");
	 }
}
