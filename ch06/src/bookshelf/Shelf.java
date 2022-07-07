package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;

	//객체 생성 시 ArrayList가 생성
	public Shelf() {
		shelf = new ArrayList<>();
	}
	public ArrayList<String> getShelf(){
		return shelf;	//리스트를 반환
	}
	public int getCount() {
		return shelf.size();	//리스트 요소의 개수 반환
	}
}
