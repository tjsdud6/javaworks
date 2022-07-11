package dbconnect;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		/*Person p1 = new Person();
		p1.setUserId("abcdefg");
		p1.setUserPw("123456789");
		p1.setName("영어숫자");
		p1.setAge(48);
		
		dao.insertPerson(p1);*/
		
		
		//자료 수정
		Person p2= new Person();
		p2.setUserId("java");		//ID는 변경 불가
		p2.setUserPw("java123");	//비밀번호 수정
		p2.setName("자바");			//이름 수정
		p2.setAge(1);
		
		dao.updatePerson(p2); 		// 자료 수정 메소드 호출
		
		//자료 삭제
		Person deleteOne = new Person();
		deleteOne.setUserId("sky");
		
		dao.deletePerson(deleteOne);
		
		
		//특정한 1명 조회 (상세보기)
		System.out.println("***** 특정 1명 조회 *****");
		Person selectOne = dao.getPerson("java");
		//System.out.println(selectOne);
		printPerson(selectOne);
	 	System.out.println("============================");
		
		
		
		//전체 조회 
		personList = dao.getPersonList();
		System.out.println("***** 전체 조회 *****");
		for(int i = 0; i < personList.size(); i++) {
		 	Person person = personList.get(i);
		 	printPerson(person);
		}
		
	}//main() 닫기
	
	public static void printPerson(Person person) {
		System.out.println("============================");
	 	System.out.println("아이디: " + person.getUserId());
	 	System.out.println("비밀번호: " + person.getUserPw());
	 	System.out.println("이름: " + person.getName());
	 	System.out.println("나이: " + person.getAge());
	 	
	}
	
}
