package customer;

public class GoldCustomer extends Customer{
	
	//필드
	double saleRatio;	//구매 할인율
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
}
