package generic.box2;

import generic.box.Apple;

public class GenericBoxTest {

	public static void main(String[] args) {
		// String 타입
		Box box = new Box();
		box.set("Good Luck");
		String msg = (String)box.get(); //Object가 더 커서 강제 형변환
		System.out.println(msg);
		
		//Class 타입 Apple 클래스
		box.set(new Apple("사과"));
		Apple apple = (Apple)box.get();
		System.out.println(apple);
	}

}
