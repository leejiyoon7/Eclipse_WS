package sec01.exam07;

public class SystemGetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("osName:" + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("userName:" + userName);
		
		String userDir = System.getProperty("user.dir");
		System.out.println("userDir:" + userDir);		
	}
}
