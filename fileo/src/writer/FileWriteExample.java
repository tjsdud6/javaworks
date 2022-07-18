package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteExample {

	public static void main(String[] args) {
		//���� ���� ��� ��� ��Ʈ�� ����
		try(Writer fw = new FileWriter("data.txt")){
			fw.write("Hello Java!\n");    //���ڿ�
			fw.write("������ �ݰ����ϴ�\n");
			//������ �ƴ� �ƽ�Ű �ڵ�, ����, �Ǽ��� ����� �� ����
			fw.write(48);  //���� 0     
			fw.write(10);  //���� ����(�ٹٲ�)
			
			char[] buf = {'s', 'm', 'i', 'l', 'e' };  //�迭 ���
			fw.write(buf);
			fw.write(10);
		    fw.write(buf, 1, 4);   //1�� �ε������� 2�� ���
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�!");
	}
}
