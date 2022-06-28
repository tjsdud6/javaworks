package Mathod;

public class Add {
	
	//return값이 있는 함수 - 정수를 반환하는함수
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	//문자열 반환하는 함수
	public static String message() {
		return "안녕하세요";
	}
	public static void main(String[] args) {
	
		//함수 호출
	    int sum = add(10, 20);
	    System.out.println("두 수의 합 : " + sum);
	    
	    String msg = message();
	    System.out.println(msg);
	}

}
