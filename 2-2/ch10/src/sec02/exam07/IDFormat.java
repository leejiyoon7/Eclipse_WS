package sec02.exam07;

public class IDFormat {
	private String userID;
	
	public String getUserID(){
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{		
		if(userID == null){
			throw new IDFormatException("���̵�� null �� �� �����ϴ�");
		}
		else if( userID.length() < 8 || userID.length() > 20){
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
		}
		
		this.userID = userID;
	}
}
