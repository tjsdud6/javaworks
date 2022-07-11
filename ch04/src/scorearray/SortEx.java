package scorearray;

public class SortEx {

	public static void main(String[] args) {
		// 정렬(버블 정렬) - 오름차순
		int[] arr = {3, 6, 9, 2, 5, 4};
		int i , j , temp; //temp - 변수 값 교환 시 사용

		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		/*
		 * i = 0 (1행) 3, 6, 2, 5, 4, 9 
		 * i = 1 (2행) 3, 2, 5, 4, 6, 9
		 * i = 2 (3행) 2, 3, 4, 5, 6, 9  오름차순 정렬 완료
		 * i = 3 (4행) 
		*/
		
		for(int a: arr)
			System.out.print(a + " ");
	}//main 닫기

}
