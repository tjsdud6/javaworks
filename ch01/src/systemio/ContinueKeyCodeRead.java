package systemio;

import java.io.IOException;

public class ContinueKeyCodeRead {

	public static void main(String[] args) throws IOException {
		//혼공자 p.94-95
		
		int keyCode;
		
		System.out.print("여러개의 문자를 입력하세요: ");
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) //아스키코드 113번 = q
				break;
		}System.out.println("종료");
	}

}
