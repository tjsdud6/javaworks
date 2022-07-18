package decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		//자료형이 그대로 유지됨
		//보조스트림(기반스트림)
		try(FileOutputStream fos = new FileOutputStream("data1.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			
			//데이터 쓰기
			dos.writeByte('C');			//영문 한 글자
			dos.writeChar('나');			//한글 한 글자
			dos.writeInt(48);			//정수
			dos.writeFloat(2.54F); 		//실수
			dos.writeUTF("안녕하세요");		//문자열
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
