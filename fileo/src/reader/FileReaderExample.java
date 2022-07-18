package reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		//문자 파일 기반 입력 스트림 생성
		try(Reader fr = new FileReader("data.txt")){
			/*int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}*/
			while(true) {
				int i = fr.read();
				if(i == -1) break;
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
