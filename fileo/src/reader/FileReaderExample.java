package reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		//���� ���� ��� �Է� ��Ʈ�� ����
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
