package exception;


class ArrayUtil{
	public void call() throws Exception {
		//런타임 예외
		System.out.println("call 메소드 시작");
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		
		System.out.println("call 메소드 종료");
	}
}


public class ThrowsTest {

	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		
		try {
			util.call();
			System.out.println("안녕하세요!");
		}catch(Exception e) {
			System.out.println("main 메소드에서 예외처리");
		}
		System.out.println("감사합니다.");
	}

}
