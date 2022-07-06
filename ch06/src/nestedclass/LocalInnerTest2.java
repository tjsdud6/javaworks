package nestedclass;

class Outer2{
	int outNum = 100;
	static int sNum = 200;

	Runnable runner = new Runnable() {
		int num = 10;

		@Override
		public void run() {
			System.out.println(outNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println(sNum + "(외부 클래스의 정적 변수)");
			System.out.println(num + "(내부 클래스의 멤버 변수)");
		}

	};
}

public class LocalInnerTest2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.runner.run();
	}
}
