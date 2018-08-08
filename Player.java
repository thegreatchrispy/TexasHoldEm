public class Player {
	private Card[] hand;
	int money;

	public Player () {
		hand = new Card[2];
		money = 0;
	}

	public Card[] getHand () {
		return hand;
	}

	public void setHand(Card[] cards) {
		hand = cards;
	}

	public int getMoney () {
		return money;
	}

	public void setMoney (int m) {
		money = m;
	}
}