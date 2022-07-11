package cooperation;

public class Person {

	String name;	//이름
	int money;		//가진 돈
	
	//생성자
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 타는 메서드
	public void takeBus(Bus bus) {
		bus.take(1250);
		this.money -= 1250;
	}
	
	//지하철을 타는 메서드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	//사람의 정보
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money +"원 입니다.");
	}
}
