package reference;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		String strVar3 = new String("장그래");
		String strVar4 = new String("장그래");
		
		//참조 주소가 같은지 비교
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		//문자열이 같은지 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
