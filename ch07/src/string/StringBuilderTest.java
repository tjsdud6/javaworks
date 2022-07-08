package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String 클래스는 문자열을 연결하거나 변경하는 프로그램을 만들면 메모리 낭비가 발생
		// StringBuilderTest - 내부에 변경 가능한 char[] 변수를 가지고 있음
		// 추가 메모리를 사용하지 않음

		String javaStr = new String("java");
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));

		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		
		//문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!!");
		
		
		javaStr = buffer.toString();
		
		System.out.println(javaStr);
		System.out.println("연산 후 buffer 메모리 주소: "+ System.identityHashCode(buffer));
	}

}
