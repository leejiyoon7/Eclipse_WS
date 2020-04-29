package sec01.exam01;

public class InnerClassExample {
	public static void main(String[] args){
		
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();    // 내부 클래스 기능 호출
	    System.out.println();
	    
	    // 외부 클래스를 이용하여 내부 클래스 생성
		OutClass.InClass inClass = outClass.new InClass();   
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();		
		System.out.println();
		
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성(일반 메서드 호출을 위해)
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();  
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();	
	}
}
