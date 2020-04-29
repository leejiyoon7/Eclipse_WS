package sec01.exam13;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public static void main(String[] args) {
		//autoSaveThread ����
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);//���� ����
		autoSaveThread.start();
		
		//JVM���� �������� ��� �����带 Map �÷������� ����(key:Thread, value:StackTraceElement[]) 
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();// map.keySet���� Set �÷��� ����
		
		for(Thread thread : threads) {
			System.out.println("Name: " + thread.getName() + ((thread.isDaemon())?"(����)": "(��)"));
			System.out.println("\t" + "�Ҽӱ׷�: " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
