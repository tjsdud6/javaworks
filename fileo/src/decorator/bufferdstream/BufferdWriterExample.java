package decorator.bufferdstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriterExample {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("animal.txt");
				BufferedWriter bw = new BufferedWriter(fw)){
			
			//데이터 쓰기
			bw.write("cat");
			bw.write("dog");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
