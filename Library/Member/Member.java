package Library.Member;

public class Member {
	
	
	String name;
	String MemberId;
	
	public Member(String name, String MemberId) {
	
		
		this.MemberId=MemberId;
		this.name=name;
	}
	
	
	public void MemberDisplay() {
		
		System.out.println("MemberId"+MemberId);
		System.out.println("Name"+name);
		
		
		
	}
	
	public String getMemberId() {
		
		return MemberId;
		
	}
	

}
