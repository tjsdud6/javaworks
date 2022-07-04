package polymorphism.child;

public class ChildTest {

	public static void main(String[] args) {
		
		//자식 객체 생성
		Child child = new Child();
		
		Parent parent = child;	//자동 타입 변환
		
		parent.method1();
		parent.method2();
		
		//강제 타입 형변환
		Child child2=(Child)parent;
		child2.method3();
	}

}
