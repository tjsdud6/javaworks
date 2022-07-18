package decorator.bufferdstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try (InputStream fis = new FileInputStream("reader.txt");
			InputStreamReader isr = new InputStreamReader(fis)) {
			
			while(true) {
				int data = isr.read();
				if(data == -1)break;
				System.out.print((char)data);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

