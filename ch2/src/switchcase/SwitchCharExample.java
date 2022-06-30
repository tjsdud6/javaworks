package switchcase;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		// 혼공자 p.143~144
		
		Scanner scanner = new Scanner(System.in);
		//char grade = " ";
		
		System.out.print("등급을 입력하세요: ");
		String grade = scanner.nextLine();
		
		switch(grade) {
		case "A":
		case "a":
			System.out.println("우수 회원입니다.");
		break;
		case "B":
		case "b":
			System.out.println("일반 회원입니다.");
		break;
		default:
			System.out.println("손님입니다.");
		}
		scanner.close();
	}

}
