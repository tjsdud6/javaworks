package operator;

public class Swap {

	public static void main(String[] args) {
		// 변수의 값을 서로 바꾸는 프로그램
		
		int x = 0, y = 1;
		int temp = 0;
		
		System.out.println("교환 전");
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("-----------------");
		
		//교환 처리 
		temp = x; //temp = 0
		x = y; // x = 1
		y = temp; // y = 0

		System.out.println("교환 후");
		System.out.println("x = " + x + ", y = " + y);
	}

}
