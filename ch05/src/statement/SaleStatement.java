package statement;

public class SaleStatement {

	public static void main(String[] args) {
		
		Drink coffee = new Drink("커피",2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		Alcohol soju = new Alcohol("소주", 4000, 5, 15.4f);
		
		//드링크 전표
		Drink.printTitle();
		System.out.println("------------------------------------");

		coffee.PrintData();
		tea.PrintData();
		
		System.out.println(" ");
		
		//알콜 전표
		Alcohol.printTitle();
		System.out.println("------------------------------------");
		soju.PrintData();
		
		//전체 총액
		int sum = coffee.getTotlaPrice() + tea.getTotlaPrice()
				  + soju.getTotlaPrice();
		
		System.out.println("\n *** 합계금액: " + sum + "원 ***" );
	}

}
