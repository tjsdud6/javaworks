package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		//BookShelf bookShelf = new BookShelf();
		//인터페이스 타입으로 객체 생성
		Queue shelQueue = new BookShelf();
		
		//자료 삽입
		shelQueue.enQuee("반응형 웹");
		shelQueue.enQuee("혼공 Java");
		shelQueue.enQuee("스프링부트");
		
		//자료의 개수
		System.out.println("현재 리스트의 개수: " + shelQueue.getSize() + "권");
		
		//자료 출력
		System.out.println(shelQueue.deQueue());
		System.out.println(shelQueue.deQueue());
		System.out.println(shelQueue.deQueue());
	}

}
