package object.clone;

public class CircleMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Point point = new Point(3, 4);
		System.out.println(point.toString());
		
		Circle circle = new Circle(5, 6, 4);
		System.out.println(circle.toString());
		
		//circle 객체 복사
		Circle copyCircle = (Circle)circle.clone();
		System.out.println(copyCircle);
	}

}
