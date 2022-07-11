package scorearray;

public class ScoreRanking {

	public static void main(String[] args) {
		// 순위 정하기
		int[] score = {80, 90, 74 ,100, 50};
		int[] rank = new int[5];
		//rank = {1, 1, 1, 1, 1};
		
		for(int i = 0; i < score.length; i++) {
			int count = 1;
			for(int j = 0; j < score.length; j++) {
				if(score[i] < score[j])
					count++;
				}
				rank[i] = count;
			}
			/*
			 * i=0, 80 < 80, 80 < 90(카운트 증가), 80 < 74, 80 < 100(카운트 증가), 80 < 50  count = 3
			 
			 * i=1, 90 < 80, 90 < 74, 90 < 100(카운트 증가), 90 < 50 count = 2
			 
			 * i=2, 74 < 80(카운트 증가), 74 < 90(카운트 증가), 74 < 100(카운트 증가), 74 < 50 count = 4
			 
			 * i=3, 100 < 80, 100 < 90, 100 < 74, 100 < 50	count = 1
			
			 * i=3, 50 < 80(카운트 증가), 50 < 90(카운트 증가), 50 < 74(카운트 증가), 50 < 100(카운트 증가) 	count = 5 
			*/
			
			for(int i = 0; i < rank.length; i++) {
				System.out.print(rank[i]+" ");
			}
		}
	}

