package sec01.exam04;

public class MemberExample {
	public static void main(String[] args) {
	    Member original = new Member("sony", "손흥민", "1234", 26, true);
	    
	    //getMember()를 호출하여 복제한 객체를 가져옴
        Member clonedObj = original.getMember();
        
        //원본 객체 필드 출력
        System.out.println("원본객체:" + original.toString());
        
        //복제 객체 필드 출력
        System.out.println("복제객체:" + clonedObj.toString());
        
        //복제 객체의 password 변경 - 복제 객체의 패스워드만 변경됨
        clonedObj.password = "4321"; 
        System.out.println("원본객체 패스워드:" + original.password);
        System.out.println("복제객체 패스워드:" + clonedObj.password );
	}
}
