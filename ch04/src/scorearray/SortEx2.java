package scorearray;

public class SortEx2 {

	public static void main(String[] args) {
		// 오름차순 정렬 - 문자
		char[] arr = {'S','B','M','K','C','Z','A'};
		int i, j;
		char temp; //문자를 저장할 교환용 변수
		
		for(i=0; i <arr.length; i++) {
			for(j = 0; j < arr.length -1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//{83, 66, 77, 75, 67}
		
		//문자 출력
		for(char ch : arr) {
			System.out.print(ch+ " ");
		}
		System.out.println();
		//코드값 출력
		for(int ch : arr) {
			System.out.print(ch+ " ");
		}
	}

}
