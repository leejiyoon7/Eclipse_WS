package project.student.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// 두 명의 학생 객체 생성
		  Student james = new Student("James", 5000);   
		  Student tomas = new Student("Tomas", 10000);
		  
		  james.showInfo();   // james 정보 출력
		  tomas.showInfo();   // Tomas 정보 출력
		  System.out.println("===================");
		  
		  //100번 버스 객체 생성
		  Bus bus100 = new Bus(100);
		  
		  // james가 100번 버스 탄 경우
		  james.takeBus(bus100);     
		  james.showInfo();   // james 정보 출력
		  bus100.showInfo();  // 100번 버스 정보 출력
		  System.out.println("===================");
		
		  //2호선 지하철 객체 생성
		  Subway subway2 = new Subway("2호선");  
		  
		  // Tomas가 2호선 지하철을 탄 경우
		  tomas.takeSubway(subway2); 
		  tomas.showInfo();   // Tomas 정보 출력
		  subway2.showInfo(); // 2호선 지하철 정보 출력 
	}
}
