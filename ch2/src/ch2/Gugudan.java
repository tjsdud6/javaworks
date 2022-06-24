package ch2;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 전체 출력하기
		int dan, times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + (dan*times));
			}
			System.out.println();
		}
	}

}
