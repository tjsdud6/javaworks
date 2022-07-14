package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member chu = new Member(1001, "추신수");
		Member son = new Member(1002, "손흥민");
		Member park = new Member(1003, "박인비");
		Member kim = new Member(1004, "김연아");
		
		//회원 추가
		memberArrayList.addMember(chu);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(kim);
		
		//회원 전체 목록
		memberArrayList.showAllMember();
		
		System.out.println("-----------------------------------");
		
		//회원 삭제
		memberArrayList.removeMember(1002);
		memberArrayList.removeMember(1005);
		
		memberArrayList.showAllMember();

	}

}
