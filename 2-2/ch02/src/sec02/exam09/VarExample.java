package sec02.exam09;

public class VarExample {
	public static void main(String[] args) {
		var iNum = 100;
		var dNum = 123.0;
		var str = "java";
		
		System.out.println("iNum:" + iNum);
		System.out.println("dNum:" + dNum);
		System.out.println("str:" + str);
		
		str = "hello java";
		System.out.println("str:" + str);
		
		//str = 100;//Type mismatch: cannot convert from int to String
	}
}
