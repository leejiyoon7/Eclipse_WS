package sec01.exam09;

public class NewInstanceExample {
	public static void main(String[] args) {
		String className=null;
		
		try {
			// args[] 매개변수에 따라 실행 클래스 지정 
			if(args[0].equals("0")) {
				className = "sec01.exam09.SendAction";
			} else {
				className = "sec01.exam09.ReceiveAction";
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}		
		
		try {
			//Class 객체 생성
			Class obj = Class.forName(className);
			System.out.println(obj.toString());
			
			/* Class 객체의 newInstance() 메소드로 Object 객체를 동적으로 생성
			 - newInstance() 메소드는 기본 생성자를 호출해서 객체를 생성하기 때문에 
			   getDeclaredConstructor() 메소드로 생성자를 호출
			 - 동적으로 생성된 객체는 모두 Action 인터페이스를 구현하고 있기 때문에
			   Action 인터페이스 타입으로 강제 타입 변환이 가능(newInstance() 메소드의 리턴 타입은 Object)*/
			Action action = (Action) obj.getDeclaredConstructor().newInstance();
			
			/*Action 인터페이스의 execute() 메소드를 호출하면, 개별 클래스에 재정의된 execute() 메소드가 실행*/
			action.execute();
		} catch (Exception e) {			
			System.out.println(e);
		}		
	}
}
