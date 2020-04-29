package sec01.exam01;

import java.lang.reflect.InvocationTargetException;

public class ClassNotFoundExceptionExample {
	public static void main(String[] args) {
		if (args.length >= 1) {
			try {
				//args[0]�� ���޵� Class�� classEx�� �Ҵ�
				Class classEx = Class.forName(args[0]);
				System.out.println(classEx);
				
				//�������� ��ü ����
				try {
					Object obj = classEx.getDeclaredConstructor().newInstance();
					System.out.println("obj ��ü�� �����Ǿ����ϴ�.");
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
				System.out.println("Exception �߻�: " + e.getMessage());
				System.out.println("Exception �߻�: " + e.toString());
				System.out.print("Exception �߻�: ");
				e.printStackTrace();				
			} finally {
				System.out.println("���α׷��� ���������� �����մϴ�.");
			}
		}		
	}
}
