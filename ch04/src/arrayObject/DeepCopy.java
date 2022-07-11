package arrayObject;

public class DeepCopy {

	public static void main(String[] args) {

		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];

		//arr1의 데이터
		arr1[0] = new Book("혼공 자바", "신용권");
		arr1[1] = new Book("반응형 웹", "조혜경");
		arr1[2] = new Book("스프링부트", "채규태");

		//arr2의 데이터는 기본 생성자로 생성
		arr2[0] = new Book();
		arr2[1] = new Book();
		arr2[2] = new Book();
		
		//arr1의 요소를 arr2에 복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i].setBookName(arr1[i].getBookName());
			arr2[i].setAuthor(arr1[i].getAuthor());
		}
		
		//arr1의 요소 수정
		arr1[0].setBookName("미생");
		arr1[0].setAuthor("윤태호");
		
		//출력
		System.out.println("== arr1 출력 ==");
		for(int i=0 ; i < arr2.length; i++) {
			arr1[i].showInfo();
		}
		System.out.println("== arr2 출력 ==");
		for(int i=0 ; i < arr2.length; i++) {
			arr2[i].showInfo();
		}
		
	}

}
