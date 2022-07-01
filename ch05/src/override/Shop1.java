package override;

public class Shop1 extends HeadShop{

	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}
	
	//메서드 재정의 - 부모 클래스와 내용이나 기능이 다를 때 재정의
	//에너테이션 - '@'컴파일러에게 신호를 보냄
	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌개: 6,000");
	}
	@Override
	public void sellkimchJJige() {
		System.out.println("김치찌개: 6,500");
	}
	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥: 6,500");
	}
}
