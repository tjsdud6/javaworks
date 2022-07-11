package reference;
public class CircleTest {

	public static void main(String[] args) {
		// 원 만들기
		Circle circle1 = new Circle(3, 4, 5);
		Circle circle2 = new Circle(10, 12, 15);
		
		System.out.println(circle1.showInfo());
		System.out.println(circle2.showInfo());
		
	}

}
