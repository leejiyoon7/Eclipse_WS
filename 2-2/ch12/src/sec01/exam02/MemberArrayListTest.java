package sec01.exam02;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member m1 = new Member(1001, "�����");
		Member m2 = new Member(1002, "�̰���");
		Member m3 = new Member(1003, "�迬��");
		Member m4 = new Member(1004, "������");
		
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
