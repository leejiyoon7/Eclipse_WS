package sec01.exam01;

public class StudentExample {
	public static void main(String[] args) {
		//°´Ã¼ »ý¼º
		Student stdSon = new Student(20183301, "¼ÕÈï¹Î");
		Student stdKim = new Student(20183302, "±è¹Î¾Æ");
		
		//°´Ã¼ »ç¿ë
		System.out.println("=== ÇÐ»ý ¸í´Ü ===");
		System.out.println("ÇÐ¹ø:" + stdSon.getId() + ", ÀÌ¸§:" + stdSon.getName());
		System.out.println("ÇÐ¹ø:" + stdKim.getId() + ", ÀÌ¸§:" + stdKim.getName());
	}
}
