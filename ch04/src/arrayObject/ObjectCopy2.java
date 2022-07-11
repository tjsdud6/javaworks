package arrayObject;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];

		arr1[0] = new Book("혼공 자바", "신용권");
		arr1[1] = new Book("반응형 웹", "조혜경");
		arr1[2] = new Book("스프링부트", "채규태");
		
		//arr1을 arr2에 복사
		/*for(int i=0 ; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}*/
		
		//arraycopy()사용
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		
		//출력
		System.out.println("== arr2 출력 ==");
		for(int i=0 ; i < arr1.length; i++) {
			arr2[i].showInfo();
		}
		
	}

}
