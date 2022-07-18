package writer;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/File/newFile.txt");
		file.createNewFile(); 
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());        
		System.out.println(file.getName());     //���� �̸�
		System.out.println(file.getPath());     //���
		
		file.delete();
	}
}
