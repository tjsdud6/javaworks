package chap05;

public class Test5_2 {

	public static void main(String[] args) {
		//혼공자 p.200
		
		// 3번
		int [][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88},
		};
		System.out.println("3번 정답: "+array[2].length);
		// array[2]의 값 =5

		System.out.println("----------------------------------");

		//4번
		int max = 0;
		int []array1 = {1, 5 ,3 ,8, 2};
		
		max = array1[0];
		for(int i=0; i<array1.length; i++) {
			if(max < array1[i])
				max = array1[i];
		}
		System.out.println("4번 정답: max값은 " + max);
		
		System.out.println("----------------------------------");

		//5번
		
		int[][]score = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
			};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				sum += score[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		System.out.println("sum" + sum);
		System.out.println("avg" + avg);
	}

}
