package polymorphism.child;

public class Child extends Parent{

	@Override //재정의
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
	
	
}
