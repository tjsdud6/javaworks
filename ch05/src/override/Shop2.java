package override;

public class Shop2 extends HeadShop{

	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}
	
	//메서드 재정의 - 부모 클래스와 내용이나 기능이 다를 때 재정의
	//에너테이션 - '@'컴파일러에게 신호를 보냄
	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌개: 7,000");
	}
	@Override
	public void sellkimchJJige() {
		System.out.println("김치찌개: 7,500");
	}
	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥: 7,500");
	}
}
