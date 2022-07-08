package object;

public class Book {
	//필드
	int bookNumber;
	String bookTitle;
	
	//생성자
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;			
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;
			if(this.bookNumber == book.bookNumber) {
				return true;
			}
		}
		return super.equals(obj);
	}
	
}
