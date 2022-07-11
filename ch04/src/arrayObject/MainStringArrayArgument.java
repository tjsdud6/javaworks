package arrayObject;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// 혼공자 p.187
		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); //프로그램 강제 종료
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); //저장된 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + ", " + num2 + "= " + result);
		
	}

}
