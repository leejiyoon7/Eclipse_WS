package sec01.exam13;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public static void main(String[] args) {
		//autoSaveThread 생성
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);//데몬 설정
		autoSaveThread.start();
		
		//JVM에서 실행중인 모든 스레드를 Map 컬렉션으로 생성(key:Thread, value:StackTraceElement[]) 
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();// map.keySet으로 Set 컬렉션 생성
		
		for(Thread thread : threads) {
			System.out.println("Name: " + thread.getName() + ((thread.isDaemon())?"(데몬)": "(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}
