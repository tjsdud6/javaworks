package Mathod;

public class OneUp2 {
	
		static int x = 1;
	
		//1을 더하는 함수
		public static int oneUp() {
			x = x+1;
			return x;
		}
	
	public static void main(String[] args) {
		
		//호출
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //3
		System.out.println(oneUp()); //4
	}

}
