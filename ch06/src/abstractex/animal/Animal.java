package abstractex.animal;

public abstract class Animal {
	
	public String kind;	//종류
	
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 - 선언만 있고 구현부가 없다
	public abstract void sound();
	
	
}
