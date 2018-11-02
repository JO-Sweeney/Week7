package Problem2Redo;

public class Member extends Person{
	
	private String mMemberNo;
	private String mMemberType;
	
	public Member(String forename, String surname, String num, String type){
		super(forename, surname);
		mMemberNo = num;
		mMemberType = type;
	}
	
	public String getNumber() {
		return mMemberNo;
	}
	
	public String getType() {
		return mMemberType;
	}

}
