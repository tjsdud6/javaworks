package taketrans;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	//차량에 탑승
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee;
	}
	//정보
	public void showInfo() {
		System.out.printf("%s의 남은 돈은 %,d 원 입니다.\n", name, money);
	}
}
