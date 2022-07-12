package banking;

import java.util.Scanner;

public class Main {
	//배열의 크기가 100인 Account형 배열 선언
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		boolean run = true;		//실행 변수
		
		while(run) {
			System.out.println("=================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("=================================================");
			System.out.print("선택> ");
			
			String selectNo = scanner.next();	//nextLine()은 자동 줄바꿈이 되는 경우가 있어 next() 사용
			if(selectNo.equals("1")) {
				createAccount();	// 계좌 생성
			}else if(selectNo.equals("2")) {
				accountList();		// 계좌 목록
			}else if(selectNo.equals("3")) {
				deposit();			// 입금
			}else if(selectNo.equals("4")) {
				withdraw();			// 출금
			}else if(selectNo.equals("5")) {
				run = false;		// 종료
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}//while 닫기
		System.out.println("***** 프로그램 종료 *****");
	}


	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		//계좌 객체 생성
		Account newAccount = new Account(ano, owner, balance);
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {	//배열의 공간이 null인 경우
				accountArray[i] = newAccount;	//계좌를 배열에 저장 
				System.out.println(" [결과: 계좌가 생성되었습니다.] ");
				break;
			}
		}
	}


	private static void accountList() {
		System.out.println("[계좌 목록]");
		
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];	//배열에 저장된 account를 반환
			if(account != null) {
				System.out.print("계좌번호: " + account.getAno() + "\t");	
				System.out.print("계좌주: " + account.getOwner() + "\t");	
				System.out.println("잔액: " + account.getBalance() + "\t");
				System.out.println("---------------------------------------------");
			}
		}
	}


	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.next();
		
		//계좌가 없습니다. 다시 입력하세요
		
		Account account = findAccount(ano);
		
		System.out.println("입금액: ");
		int money = scanner.nextInt();
		account.setBalance(account.getBalance() + money);
		System.out.println(" [결과: 입금을 성공하였습니다.] ");
		
		
	}


	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		
		System.out.println("출금액: ");
		int money = scanner.nextInt();
		account.setBalance(account.getBalance() - money);
		System.out.println(" [결과: 출금을 성공하였습니다.] ");
	}

	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] !=null) {
			String dbAno = accountArray[i].getAno(); //저장 된 계좌를 가져와서
			if(dbAno.equals(ano)) {
				account = accountArray[i];
				break;
				}
			}
		}
		return account;
	}
}
