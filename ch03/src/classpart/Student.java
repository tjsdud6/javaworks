package classpart;

public class Student {
	// 필드(멤버 변수)
	int studentId; //학번
	String studentName; //이름
	
//메소드
	void showInfo() {
		System.out.println("학번 : " + studentId + ", 이름 : " + studentName);
	}
}