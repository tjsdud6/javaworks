package classpart;

public class PersonTest {

	public static void main(String[] args) {
		
		// Person 사용
		Person p1 = new Person();
		Person p2 = new Person("추신수");
		Person p3 = new Person("추신수", 170.5f, 60.8f);
		
		
		//p1 입력
		p1.name = "손흥민";
		p1.height = 183.2f;
		p1.weight = 76.7f;
		
		//p2 입력
		p2.height = 180.3f;
		p2.weight = 90.2f;		
		
		// 출력
		p1.showInfo();
		p2.showInfo();		
		p3.showInfo();		
	}
}