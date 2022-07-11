package cooperation;

public class Subway {
	//필드
	String lineNumber;
	int passenger;
	int money;
	
	//생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//사람 태우는 메서드
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	//지하철 정보
	public void showInfo() {
		System.out.println(lineNumber + "호선 지하철의 수입은 " + money +"원이고, 승객수는 "+ passenger + "명 입니다.");
	}
	
}
