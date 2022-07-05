package chap07;

public class Test7_2 {

	public static void main(String[] args) {
		
		// 1. o x o o 
		
		// 2.
		SnowTire snowtire = new SnowTire();
		Tire tire = snowtire;
		
		snowtire.run();
		tire.run();
		
		// 3. 2
		
		/*
		 A a = new B();
		 B b = (B)a; //a가 B클래스의 객체
		*/
		
		//4. x o o o x x 
		
		//5.
		
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService());
		controller.service.login();
	}

}
