package decorator.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		// 현재의 인스턴스 상태를 저장 - 보조스트림(ObjectOutputStream)

		//Person 객체 생성
		Person personSon = new Person("손정의", "대표이사");

		//serial.out - 객체의 정보를 저장할 파일 
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			//객체를 파일에 씀
			oos.writeObject(personSon);
		}catch(IOException e) {
			e.printStackTrace();
		}
		//역직렬화
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			//객체 정보 읽기
			Person p1 = (Person) ois.readObject();
			System.out.println(p1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
