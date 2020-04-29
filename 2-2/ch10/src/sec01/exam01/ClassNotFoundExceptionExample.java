package sec01.exam01;

import java.lang.reflect.InvocationTargetException;

public class ClassNotFoundExceptionExample {
	public static void main(String[] args) {
		if (args.length >= 1) {
			try {
				//args[0]로 전달된 Class를 classEx에 할당
				Class classEx = Class.forName(args[0]);
				System.out.println(classEx);
				
				//동적으로 객체 생성
				try {
					Object obj = classEx.getDeclaredConstructor().newInstance();
					System.out.println("obj 객체가 생성되었습니다.");
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				System.out.println("Exception 발생: " + e.getMessage());
				System.out.println("Exception 발생: " + e.toString());
				System.out.print("Exception 발생: ");
				e.printStackTrace();				
			} finally {
				System.out.println("프로그램이 정상적으로 종료합니다.");
			}
		}		
	}
}
