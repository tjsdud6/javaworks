package builtinclass;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		//영어 타자 게임 만들기
	
		String[] words = {"river","mountian","sky","earth","moon","tree","flower","cow","pig","horse"};
		
		int n = 1; //문제 번호
		long start, end;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영어 타자 게임, 준비되면 엔터");
		scan.nextLine();
		start = System.currentTimeMillis(); //게임시작 시간측정
		
		while(n < 11) {
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제 "+ n);
			String question = words[rand];
			System.out.println(question); //화면에 문제 표시

			String answer = scan.nextLine();
			if(answer.equals(question)) { //equals()문자열이 같은지 비교 (숫자 : ==)
				System.out.println("통과!");
				n++; //다음 문제로 넘어감
			}else {
				System.out.println("오타! 다시 도전");
			}
			
		}
		end = System.currentTimeMillis(); //게임종료 시간 측정(현재 시간 - 게임 종료)
		System.out.println("게임 소요시간은 " + (end-start)/ 1000 + "초 입니다.");
		
		scan.close();
	}
}
