package singleton.car;

public class Car {
	//차의 고유번호를 증가
	
	private static int serialNum = 10000; //기준 번호
	private int carNum; //차 번호 
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	//차 번호 가져오기
	public int getCarNum() {
		return carNum;
	}
}
