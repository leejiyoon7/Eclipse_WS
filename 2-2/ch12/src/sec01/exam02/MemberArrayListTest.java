package sec01.exam02;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member m1 = new Member(1001, "º’»ÔπŒ");
		Member m2 = new Member(1002, "¿Ã∞≠¿Œ");
		Member m3 = new Member(1003, "±Ëø¨æ∆");
		Member m4 = new Member(1004, "æ∆¿Ã¿Ø");
		
		memberArrayList.addMember(m1);
		memberArrayList.addMember(m2);
		memberArrayList.addMember(m3);
		memberArrayList.addMember(m4);
		
		memberArrayList.showAllMember();
		
		System.out.println("m4.getMemberId():" + m4.getMemberId());
		memberArrayList.removeMember(m4.getMemberId());
		
		memberArrayList.showAllMember();
	}
}
