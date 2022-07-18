package decorator.bufferdstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EngilshTypingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try(FileReader fr = new FileReader("word.txt");
				BufferedReader br = new BufferedReader(fr)){

			String[] word = null;
			String data = null;
			while(true) {
				data = br.readLine();
				if(data == null) break;
				word = data.split(" ");
			}

			int n = 1;
			long start = 0, end = 0;
			System.out.println("타자 연습 게임 - 준비 되면 [Enter]");
			sc.nextLine();
			start = System.currentTimeMillis();

			while(n <= 10) {
				System.out.println("문제 " + n);
				int rand = (int) (Math.random() * word.length);
				String question = word[rand];
				System.out.println(question);

				String answer = sc.nextLine();

				if(answer.equals(question)) {
					System.out.println("통과!!");
					System.out.println(" ");
					System.out.println("--------");
					n++;
				}else {
					System.out.println("오타! 다시 도전!");
				}
			}
			end = System.currentTimeMillis();

			System.out.println("게임 소요시간 " + (float)(end-start)/1000 + "초");
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
