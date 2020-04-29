package sec01.exam03;

public class OuterClass {
	
	public void start() {
		class LocalClass {
			int x, y;
			public void sum() {
				System.out.println(x+y);				
			}
		}
		
		LocalClass lc = new LocalClass();
		lc.x = 100;
		lc.y = 200;
		lc.sum();
	}//end od start()	
}
