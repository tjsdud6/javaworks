package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQuee(String title) {
		shelf.add(title);			//리스트에 요소 추가
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);		//맨 처음 요소를 리스트에서 삭제 하고 반환
	}

	@Override
	public int getSize() {
		return getCount();			//리스트 요소의 개수 반환 
	}
	
}
