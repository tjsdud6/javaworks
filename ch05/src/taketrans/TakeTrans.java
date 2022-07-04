package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		//사람 객체 생성
		Student sohee = new Student("박소희", 10000);
		Student deaho = new Student("이대호", 20000);
		
		//버스 객체 생성
		Bus bus100 = new Bus("bus100");
		
		//택시 객체 생성
		Taxi kakaoTaxi = new Taxi("카카오택시");
		
		//버스 타다
		sohee.take(bus100, 1200);
		deaho.take(bus100, 1200);
		
		//택시 타다
		sohee.take(kakaoTaxi, 3800);
		
		//정보 출력
		sohee.showInfo();
		deaho.showInfo();
		bus100.showInfo();
		kakaoTaxi.showInfo();
	}

}
