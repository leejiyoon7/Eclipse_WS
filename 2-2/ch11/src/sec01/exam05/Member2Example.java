package sec01.exam05;

public class Member2Example {
	public static void main(String[] args) {
	    Member2 original = new Member2("손흥민", 27, new int[] {100, 97}, new Car("제니시스"));
	    
	    //getMember()를 호출하여 복제한 객체를 가져옴
        Member2 clonedObj = original.getMember();
        String score= "";
        
        //원본 객체 필드 출력
        System.out.println("원본객체:" + original.toString());
        
        //원본 객체 scores 배열 출력        
        for(int i=0; i<original.scores.length; i++) {
        	score += (original.scores[i]+" ");
        }
        System.out.println("scores:" + score);
        
        //원본 객체 Car 객체 필드 출력
        System.out.println("Car Model:" + original.car.model);
        System.out.println();
        
        //복제 객체의 scores, car 필드 변경
        clonedObj.scores[0] = 95;
        clonedObj.scores[1] = 99;
        clonedObj.car = new Car("BMW");
        
        //복제 객체 필드 출력
        System.out.println("복제객체:" + clonedObj.toString());
        score= "";
        
        //복제 객체 scores 배열 출력        
        for(int i=0; i<clonedObj.scores.length; i++) {
        	score += (clonedObj.scores[i]+" ");
        }
        System.out.println("scores:" + score);
        
        //복 객체 Car 객체 필드 출력
        System.out.println("Car Model:" + clonedObj.car.model);
        System.out.println();
	}
}

