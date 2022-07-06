package innerinterface;

public class CallListener implements Button.OnClickListener{

	//버튼
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
