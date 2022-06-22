package ch01;

public class StringType {

	public static void main(String[] args) {
		// 문자열 자료형
		char c = 'k';
		String s = "k"; //string형 쌍따
		
		String name = "Ja" + "Va";
		String str = name + 8.0; //문자가 숫자보다 크므로 문자형으로 변환
		
		System.out.println(name);
		System.out.println(str);
	}

}
