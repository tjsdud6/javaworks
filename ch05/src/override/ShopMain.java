package override;

public class ShopMain {

	public static void main(String[] args) {
		
		//HeadShop
		HeadShop headShop = new HeadShop();
		System.out.println("본접입니다.");

		headShop.sellDoenjangJJige();
		headShop.sellkimchJJige();
		headShop.sellBibimBap();
		
		System.out.println("=======================");
		//Shop1 클래스의 객체 생성
		
		Shop1 shop1 = new Shop1();
		//HeadShop shop1 = new Shop1(); //부모
		
		shop1.sellDoenjangJJige();
		shop1.sellkimchJJige();
		shop1.sellBibimBap();
		
		System.out.println("=======================");
		
		//Shop2 클래스의 객체 생성
		Shop2 shop2 = new Shop2();
		
		shop2.sellDoenjangJJige();
		shop2.sellkimchJJige();
		shop2.sellBibimBap();
		
	}

}
