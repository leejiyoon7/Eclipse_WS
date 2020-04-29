package sec02.exam07;

public class IDFormatExceptionExample {
	public static void main(String[] args) {

		IDFormat idf = new IDFormat();
		String userID = null;
		try {
			idf.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			idf.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
