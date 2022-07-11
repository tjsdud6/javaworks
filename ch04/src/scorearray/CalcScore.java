package scorearray;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		boolean run = true; //실행 변수
		int studentN = 0;	//학생수(배열의 크기)
		int[] scores = null; //점수 배열
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			try {
				System.out.println("----------------------------------------------------");
				System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("----------------------------------------------------");
				System.out.print("선택 > ");
				
				int selectNo = Integer.parseInt(scan.nextLine()); //문자를 정수로 변환
				
				if(selectNo == 1) {
					System.out.print("학생 수 > ");
					studentN = Integer.parseInt(scan.nextLine()); //학생수 
					scores = new int[studentN]; //학생수 만큼 점수의 크기 선언
				}else if(selectNo == 2) {
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "] > ");
						scores[i] = Integer.parseInt(scan.nextLine());
					}
				}
				else if(selectNo == 3) {
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "] > " + scores[i]);
					}
				}
				else if(selectNo == 4) {
					int sumV = 0;
					double avgV = 0.0;
					int maxV = scores[0]; //최고점수 0번 인덱스로 초기화
					
					//총점
					for(int i =0; i <scores.length; i++) {
						sumV += scores[i];
						if(maxV < scores[i])
							maxV = scores[i];
					}
					//System.out.println(sumV);
					avgV = (double)sumV / scores.length;
					System.out.printf("평균점수 : %.2f " , avgV);
					System.out.println("최고점수 : " + maxV);
				}else if(selectNo == 5) {
					run = false;
				}else {
					System.out.println("※지원되지 않는 기능입니다. 다시 선택하세요.※");
				}
			}catch(Exception e) {
				System.out.println("※올바르게 선택해 주세요※");
			}
		} //while 닫기
		System.out.println("프로그램 종료!");
		scan.close();
	}
	

}
