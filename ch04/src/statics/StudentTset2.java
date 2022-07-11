package statics;

public class StudentTset2 {

	public static void main(String[] args) {
		//학생 객체 생성
		Student2 lee = new Student2();
		Student2 han = new Student2();
		
		lee.setName("이대한");
		han.setName("한지수");
		
		System.out.println("학번: " + lee.getId());
		System.out.println("이름: " + lee.getName());
		System.out.println();
		System.out.println("학번: " + han.getId());
		System.out.println("이름: " + han.getName());

	}

}
