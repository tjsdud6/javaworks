package customer;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 매개변수를 가진 생성자로 객체 생성
		Customer lee = new Customer(10010, "이순신");
		//VIPCustomer king = new VIPCustomer(10020, "세종대왕", 1446);
		//부모 클래스로 객체 생성 - 자동 타입 변환(형변환)
		Customer king = new VIPCustomer(10020, "세종대왕", 1446);
		
		//상품 구매
		int price = 10000;
		lee.calcPrice(price);
		king.calcPrice(price);
		
		//고객 정보 출력
		System.out.println(lee.ShowCustomerInfo());
		System.out.println("");
		System.out.println(king.ShowCustomerInfo());
	}

}
