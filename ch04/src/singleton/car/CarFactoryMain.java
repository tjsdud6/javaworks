package singleton.car;

public class CarFactoryMain {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car herSonata = factory.createCar();
		
		System.out.println("sonata: " + mySonata.getCarNum());
		System.out.println("sonata: " + yourSonata.getCarNum());
		System.out.println("sonata: " + herSonata.getCarNum());
		

	}

}
