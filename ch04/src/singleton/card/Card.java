package singleton.card;

public class Card {
	//필드
	private int cardNumber;		//카드번호
	private static int serialNum = 10000; 		//기준번호
	
	public Card() {
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}
}
