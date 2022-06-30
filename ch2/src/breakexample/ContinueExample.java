package breakexample;

public class ContinueExample {

	public static void main(String[] args) {
		// 혼공자 p.159
		
		for(int i = 1; i <= 10; i++) {
			//홀수인 경우 실행 되지 않고 반복
			if(i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
