package chap03;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		// 혼공자 p.127
		
		//1번
		byte b=5;
		b = (byte)-b; //-b 가 -5가 되면서 int형으로 바뀜 따라서 강제로 (byte)를 넣어 형변환 必
		
		//2번
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println("2번- "+z);
		//출력값 : 31
		//풀이 : ++x 이기때문에 x = 11, y--로 y는 20 , 따라서 11+20 = 31
		System.out.println("2번- "+y); // 다음 행에서 y는 y--가 적용 되어 값 = 19
		System.out.println("---------------------------------------");
		//3번
		boolean stop = false;  
		while(!stop) { //!stop = true
			System.out.println("3번- 실행");
			break;
		}
		//4번
		int pencils = 534;
		int student = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils / student);
		System.out.println("4번- "+pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsLeft = (pencils % student);
		System.out.println("4번- "+pencilsLeft);
	
	
		//5번
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;
		int var4 = (int)(var3 * var2);
		System.out.println("5번- "+var4);
		
		//6번
		int value = 356;
		System.out.println("6번- " + (value - 56));
		
		//7번
		float v1 = 10f;
		float v2 = v1 / 100;
		if(v2 == 0.1) {
			System.out.println("7번- 10%입니다.");
		}else {
			System.out.println("7번- 10%가 아닙니다.");
		}
		
		//8번
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println("8번- "+area);
		
		
		//9번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("9번- 첫번째 수: ");
		double n1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("9번- 두번째 수: ");
		double n2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("---------------------------------------");
		if(n2 == 0 || n2 == 0.0) {
			System.out.println("결과: 무한대");
		}else {
			System.out.println("결과: "+(n1/n2));
		}
		
		
		sc.close();	
		
		//10번
		int va1 = 10;
		int va2 = 3;
		int va3 = 14;
		double va4 = va1 * va1 * va2 + va3;
		System.out.println("10번- 원의 넓이: " + va4);
		
		//11번
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("11번- 아이디: ");
		String name = scanner.nextLine();
		
		System.out.println("11번- 패스워드: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name == "java") {
			if(password == 1234) {
				System.out.println("11번- 로그인 성공");
			}else {
				System.out.println("11번- 로그인 실패: 패스워드 틀림");
			}
		}else {
			System.out.println("11번- 로그인 실패:아이디가 존재하지 않음");
		}
	}
}
