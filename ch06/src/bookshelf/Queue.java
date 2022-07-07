package bookshelf;

public interface Queue {
	
	//Queue(큐) - 자료구조의 한 방식
	//먼저 들어간 자료가 먼저 나옴(FIFO-First In First Out)
	
	void enQuee(String title);	//리스트의 맨 마지막에 추가
	
	String deQueue(); 			//리스트의 맨 처음 항목 반환
	
	int getSize();				//현재 Queue에 있는 개수 반환
}
