package abstractex.shop;

public class Shop1 extends HeadShop {
	
	public Shop1() {System.out.println("대학가 매장입니다");}

	@Override
	public void sellDoenjanJJige() {
		System.out.println("된장찌개: 6000원");
	}

	@Override
	public void sellKimchJJige() {
		System.out.println("김치찌개: 6500원");
		
	}

	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥: 6500원");
		
	}

}
