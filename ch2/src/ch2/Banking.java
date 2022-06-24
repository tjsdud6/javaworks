package ch2;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무 프로그램
		
		Scanner sc = new Scanner(System.in);
		boolean run = true; 	//상태(실행) 변수
		int balance = 0;		//잔고
		int money =0; 	//입, 출금액
		
		while(run) {
			//화면 만들기
			System.out.println("===============================================");
			System.out.println("메뉴를 입력하세요 | 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("===============================================");
			System.out.print("선택>");
			
			//int selNum = sc.nextInt();
			String selNum = sc.next();
			switch(selNum) {
			case "1":
				while(true) {
					System.out.print("예금액 >");
					money = sc.nextInt();
					if(money < 0) {
						System.out.println("음수를 입력할 수 없습니다. 다시 입력하세요");
					}else {
						balance += money;
						System.out.printf("%,d원 입금 정상처리 되었습니다.\n", money);
						break;
					}	
				}
				break;
			case "2":
				while(true){System.out.print("출금액 >");
				money = sc.nextInt();
				if(money > balance) {
					System.out.println("잔액이 부족합니다. 다시 입력하세요.");
				}else if(money < 0) {
					System.out.println("음수를 입력할 수 없습니다.");
				}
				else {
					balance -= money;
					System.out.printf("%,d원 출금 정상처리 되었습니다.\n", money);
				}break;}
			case "3":
				System.out.printf("잔고 > %,d\n", balance);
				break;
			case "4":
				run = false; //while 벗어남
				break;
				default:
					System.out.println("지원하지 않는 기능입니다. 다시 입력하세요");
					break;
			}
		}//while 닫기
			
			System.out.println("프로그램 종료");
			sc.close();

	}

}
