package arrayObject;

public class Book {
	//필드
	
	private String bookName; 	//책 이름
	private String author; 		//저자
	
	//기본 생성자
	public Book() {}
	
	//생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	//매서드
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
}
