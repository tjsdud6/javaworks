package ch01;

public class TypeConversion2 {

	public static void main(String[] args) {
		// 사칙연산
		int x = 10, y = 20;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y); // 값 : 0 (기본적으로 int형으로 계산)

		System.out.println((double) x/y); // 값 : 0.5 (double로 자동 형변환 됨)
	}

}
