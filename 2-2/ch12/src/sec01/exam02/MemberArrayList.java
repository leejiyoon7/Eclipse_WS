package sec01.exam02;

import java.util.ArrayList;  // ����� Ŭ���� import
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList ���� 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //����� ������ ArrayList ����
	}
	
	public void addMember(Member member){  //ArrayList �� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){  // ��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		//for������ ����(���1)
//		for(int i =0; i<arrayList.size(); i++){ // �ش� ���̵� ���� ����� ArrayList���� ã��
//			Member member = arrayList.get(i);//
//			int tempId = member.getMemberId();
//			if(tempId == memberId){            // ������̵� �Ű������� ��ġ�ϸ� 
//				arrayList.remove(i);           // �ش� ����� ����
//				return true;                   // true ��ȯ
//			}
//		}
		
		//arrayList�� iterator�� ��ȯ�Ͽ� ����(���2)
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // ������̵� �Ű������� ��ġ�ϸ� 
				arrayList.remove(member);      // �ش� ����� ����
				return true;                   // true ��ȯ
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");  //for �� ������ ���� return �� �ȵȰ��
		return false;                   
	}//end of removeMember()
	
	//arrayList�ִ� ��ü ȸ�� ��� �޼���
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}
