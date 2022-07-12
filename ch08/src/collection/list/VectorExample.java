package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();
		
		//게시글 추가
		list.add(new Board("제목","내용","글쓴이1"));
		list.add(new Board("제목","내용","글쓴이2"));
		list.add(new Board("제목","내용","글쓴이3"));
		list.add(new Board("제목","내용","글쓴이4"));
		list.add(new Board("제목","내용","글쓴이5"));
		
		//2번 인덱스 삭제
		list.remove(2);
		list.remove(3);
		
		
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}

}
