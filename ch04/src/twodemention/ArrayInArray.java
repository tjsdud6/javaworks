package twodemention;

public class ArrayInArray {

	public static void main(String[] args) {
		// 혼공자 p.192

		int[][]mathScores = new int[2][3];
	
		System.out.println(mathScores.length); //행의 길이
		System.out.println(mathScores[0].length); //열의 길이
		
		
		for(int i = 0; i <mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+ i +"]["+k+"]="+mathScores[i][k]);
			}
		}
		System.out.println();
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		
		for(int i = 0; i <englishScore.length; i++) {
			for(int k=0; k<englishScore[i].length; k++) {
				System.out.println("englishScore["+ i +"]["+k+"]="+englishScore[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95,80}, {92, 96, 80}};
		
		for(int i = 0; i <javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+ i +"]["+k+"]="+javaScores[i][k]);
			}
		}
	}

}
