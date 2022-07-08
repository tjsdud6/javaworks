package object;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		
		HashMap<Student, Integer> hashMap = new HashMap<>();
		
		hashMap.put(new Student("1"), 95);
		hashMap.put(new Student("2"), 95);
		
		int score = hashMap.get(new Student("1"));
		int score2 = hashMap.get(new Student("1"));
		
		System.out.println("1번 학생의 국어점수: "+ score);
		System.out.println("2번 학생의 국어점수: "+ score2);
	}

}
