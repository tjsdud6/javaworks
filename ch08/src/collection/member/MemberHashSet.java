package collection.member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Dao 생성
public class MemberHashSet {

	private Set<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<>();

	}

	//회원 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}

	//회원 목록 보기
	public void showAllMember() {
		
		//반복자 객체 얻기
		
		for(Member member : hashSet) {
			System.out.println(member);
		}
		
		
		/*Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { //자료가 있으면(true) 실행
			Member member = ir.next(); //1개의 객체를 가져옴 
			System.out.println(member);
		}*/
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next(); 
			int dbMemberId = member.setMemberId(); // 이미 저장된 memberId를 가져옴
			if(dbMemberId == memberId) {	//외부 입력 memberId와 같으면
				hashSet.remove(member);	//member 객체 삭제
				return true;
			}
		}
		
		System.out.println(memberId + " 번 회원이 존재하지 않습니다. ");
		return false;
	}

}
