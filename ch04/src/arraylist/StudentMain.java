package arraylist;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1001, "이양파");
		Student s2 = new Student(1002, "박마늘");
		
		s1.addSubject("국어", 95);
		s1.addSubject("수학", 90);
		
		s2.addSubject("Java", 77);
		s2.addSubject("Javascript", 85);
		
		s1.showStudentInfo();
		System.out.println(" ");
		s2.showStudentInfo();
	}

}
