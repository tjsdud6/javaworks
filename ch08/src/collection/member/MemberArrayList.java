package collection.member;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//회원 추가 메소드
	public void addMember(Member member) { //Member member = new Member(1001, "장마")
		arrayList.add(member);
	}
	
	//회원 전체 조회
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int dbMemberId = member.setMemberId();
			if(dbMemberId == memberId) {	//이미 저장된 회원 아이디
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + " 아이디가 존재하지 않습니다. ");
		return true;
	}
}
