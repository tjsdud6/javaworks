package collection.stack;

import java.util.ArrayList;
import java.util.List;

//Coin을 관리할 DAO
public class MyStack {
	
	//List형 ArrayList 객체 선언
	private List<String> arrayStack;
	
	public MyStack() {
		arrayStack = new ArrayList<>();
	}
	
	//자료 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//자료 빼기(삭제)
	public String pop() {
		int len = arrayStack.size(); 
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		//0번 인덱스부터 시작하므로 1을 빼줌
		return arrayStack.remove(len-1); 
	}
	
}
