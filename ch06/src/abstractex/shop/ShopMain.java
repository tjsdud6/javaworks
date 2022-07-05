package abstractex.shop;

public class ShopMain {

	public static void main(String[] args) {
		
		HeadShop shop1 = new Shop1();
		shop1.sellDoenjanJJige();
		shop1.sellKimchJJige();
		shop1.sellBibimBap();
		System.out.println("=======================");
		HeadShop shop2 = new Shop1();
		shop2.sellDoenjanJJige();
		shop2.sellKimchJJige();
		shop2.sellBibimBap();
		System.out.println("=======================");
	}

}
