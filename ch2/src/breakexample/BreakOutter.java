package breakexample;

public class BreakOutter {

	public static void main(String[] args) {
		// 혼공자 p.158
		
		Outter: for(char upper='A'; upper <='Z'; upper++) {
			for(char lower='a'; lower<= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter; //Outter 레이블을 찾아서 완전 빠져나감
				}
			}
			
		}
		System.out.println("프로그램 실행 종료");
	}

}
