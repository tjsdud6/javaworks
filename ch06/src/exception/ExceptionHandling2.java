package exception;

public class ExceptionHandling2 {
	
	public static void main(String[] args) {
		
		//컴파일 예외(일반예외)
		//클래스가 없을때 발생하는 예외
		//forName(클래스 이름)
		try {
			Class cls = Class.forName("java.lang.String"); // java lang에서 제공하는 Class라는 클래스..?
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}
}
