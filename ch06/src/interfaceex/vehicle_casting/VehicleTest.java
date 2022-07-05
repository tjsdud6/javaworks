package interfaceex.vehicle_casting;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle vehicle = new Bus(); //자동 타입 변환
		
		vehicle.run();
		
		//강제 타입 변환
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
