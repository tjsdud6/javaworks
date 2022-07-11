package scorearray;

public class ScoreExample {

	public static void main(String[] args) {
		//5명의 자바 과목 점수
		int[] score = {80, 90, 74 ,100, 50};
		int sumV = 0;
		double avgV = 0.0;
		int maxV;
		int minV;
		
		//총점
		for(int i = 0; i < score.length; i++) {
			sumV += score[i]; // sumV = sumV + score[i]
		}
		System.out.println("총점: " + sumV);
		
	
		//평균 = 총점 / 개수
		avgV = (double)sumV / score.length; //int형으로 계산되므로 형변환
		System.out.println("평균: " + avgV);
		
		//최고 점수
		maxV = score[0];
		for(int i = 1; i < score.length; i++) {
			if(maxV < score[i]) //최대값보다 다음 점수가 높으면
				maxV = score[i]; //최대값에 다음 점수를 저장
		}
		System.out.println("최고 점수: " + maxV);
		
		//최저 점수
		minV = score[0];
		for(int i = 1; i < score.length; i++) {
			if(minV > score[i])		//최소값보다 다음 점수가 적으면
				minV = score[i]; 	//최소값에 다음 점수를 저장
		}
		System.out.println("최저 점수: " + minV);
		
	}
}
