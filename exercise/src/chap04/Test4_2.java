package chap04;

public class Test4_2 {

	public static void main(String[] args) {
		// 혼공자 p.160
		
		//1번
		//for, while, do-while
		
		
		//2번
		
		int sum = 0;
		
		for(int i=1 ; i <= 100; i++) {
			if(i%3==0) {
				sum += i;
			}
			
		}
		System.out.println("[2번 답] 3의 배수의 총 합은= " + sum);

		
		//3번
		while(true) {
			int dice1 = (int)(Math.random()*6) +1;
			int dice2 = (int)(Math.random()*6) +1;
			System.out.println("(" + dice1 + ", "+ dice2 + ")");
			if(dice1 + dice2 ==5)
			 break;
		}
		
		//4번
		for(int x=1; x <= 10; x++) {
			for(int y=1; y <= 10; y++ ) {
				if(4*x + 5*y == 60){
					System.out.println("*");
				}
			}
		}
	}

}
