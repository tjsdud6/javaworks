package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// 자료구조 - ArrayList 클래스 사용
		ArrayList<String> cart = new ArrayList<>();
		//String[] cart2 = new String[10];	배열 
		
		//자료 입력(저장)
		cart.add("커피");
		cart.add("생수");
		cart.add("계란");
		
		//리스트의 크기
		System.out.println("장바구니 품목: " + cart.size() + "개");
		
		System.out.println("==============================");

		//ArrayList의 특정 요소를 1개 출력할 때 객체이름.get(idx) 사용
		System.out.println(cart.get(0));
		
		System.out.println("==============================");

		//전체 조회
		for(int i=0; i<cart.size(); i++) {
			String c = cart.get(i);
			System.out.println(c);
		}
		System.out.println("==============================");
		//자료 삭제 - 생수
		cart.remove(1);
		
		//자료 수정
		cart.set(0, "라면");
		
		//향상 for문 조회
		for(String c:cart)
			System.out.println(c);
	}

}
