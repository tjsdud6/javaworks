package breakexample;

public class BreakExample {

	public static void main(String[] args) {
		// 혼공자 p.157
		
		while(true) {
			int num = (int)(Math.random() *6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
