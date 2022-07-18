package decorator.bufferdstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("animal.txt");
				BufferedReader br = new BufferedReader(fr)){

			String[] animal = null;
			while(true) {

				String data = br.readLine();
				if(data == null) break;
				animal = data.split(" ");
			}
			System.out.println(animal[0]);
			
			//랜덤 출력
			int rand = (int) (Math.random()*animal.length);
			System.out.println(animal[rand]);

		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
