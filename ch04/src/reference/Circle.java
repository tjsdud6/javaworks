package reference;

public class Circle {

	Point point; //객체 멤버 (자료형)
	int radius;  //반지름
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
	
	public String showInfo() {
		return "중심점(" + point.x + ", "+ point.y + "), 반지름 " + radius;
	}
}
