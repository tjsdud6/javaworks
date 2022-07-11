package arraylist;

import java.util.ArrayList;

import reference.Subject;

public class Student {
	//필드
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목 추가 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();	//과목 객체 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);			//ArrayList에 저장
	}
	//학생 및 과목 정보 출력
	public void showStudentInfo() {
		//성적 처리
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i <subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			sum += subject.setScorePoint(); //
			System.out.println("학생 " + studentName +"의 " 
			+ subject.getSubjectName()+" 성적은 " 
			+ subject.setScorePoint()+ " 점 입니다.");
		}
		//System.out.println("총점: "+sum);
		avg = (double)sum/subjectList.size(); //총점 / 개수
		System.out.printf("학생 %s의 총점은 %d점이고, 평균은 %.1f점 입니다.\n", studentName, sum, avg);
		
		
	}
	
}
