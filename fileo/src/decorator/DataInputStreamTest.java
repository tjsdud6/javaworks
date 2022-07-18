package decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		//자료형 읽어오기
		//보조 스트림(기반스트림)
		try(FileInputStream fis = new FileInputStream("data1.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
