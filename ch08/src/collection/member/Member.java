package collection.member;

public class Member {
	private int memberId;		//회원 아이디
	private String memberName;	//회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int setMemberId() {
		return memberId;
	}
	public void getMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String setMemberName() {
		return memberName;
	}
	public void getMmemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
	}
	@Override
	public int hashCode() {
		//memberId.hashCode() - String형인 경우
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		return false;
	}
	
}
