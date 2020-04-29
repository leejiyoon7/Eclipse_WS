package sec01.exam03;

public class UsingLocalVariable {
	
	public void getValue(int arg) {  
		int var = 20; 	
		// 로컬변수는 람다식에서 final 특성을 가짐
		//arg = 100;  	//final 특성 때문에 수정 불가
		//var = 200; 	//final 특성 때문에 수정 불가
        
		//람다식
		MyFunctionalInterface fi= () -> {
			//로컬변수 사용
			System.out.println("arg: " + arg); 
			System.out.println("var: " + var + "\n");
		};
		fi.method();
	}
}

