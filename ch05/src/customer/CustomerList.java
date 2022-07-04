package customer;

import java.util.ArrayList;

public class CustomerList {

	public static void main(String[] args) {
		// 어레이리스트(ArratList) 자료구조를 사용하기
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//실버 고객 2명, 골드 2명, vip 1명 
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer youl = new GoldCustomer(10040, "이율곡");
		Customer king = new VIPCustomer(10050, "세종대왕", 1446);
		
		//자료 추가
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);
		
		System.out.println("========================== 할인율과 보너스 포인트 계산 ==========================");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 "+ cost +"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 "+ customer.bonusPoint +"점 입니다.");
		}
		
		//고객 정보
		System.out.println("==========================고객 정보 출력 ==========================");
		for(Customer customer : customerList)
			System.out.println(customer.ShowCustomerInfo());
	}

}
