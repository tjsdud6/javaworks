package annonymous.remotecontrol;

public class Anonymous {
	
	Remotecontrol field = new Remotecontrol() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};
	
	void method1(){
		Remotecontrol localVar = new Remotecontrol() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다");
			}
		};
		localVar.turnOn();	
	}
	void method2(Remotecontrol rc) {
		rc.turnOn();
	}
}
