import java.util.Random;

public class Deck {
	Card head;
	Card tail;
	Card[] cards;

	public Deck () {
		cards = new Card[52];

		for (int i = 0; i < 13; i++) {
			cards[i] = new Card("HEART", i+1);
			cards[i+13] = new Card("CLUBS", i+1);
			cards[i+26] = new Card("DIAMOND", 13-i);
			cards[i+39] = new Card("SPADE", 13-i);
		}

		head = cards[0];
		tail = cards[51];
	}

	public void shuffle () {
		Random rand = new Random();
		rand.nextInt();

		for (int i = 0; i < 52; i++) {
			int change = i + rand.nextInt(52 - i);
			swap(cards, i, change);
		}

		head = cards[0];
		tail = cards[51];
	}

	public void swap (Card[] cards, int i, int change) {
		Card temp = cards[i];
		cards[i] = cards[change];
		cards[change] = temp;
	}

	public void display () {
		for (int i = 0; i < 52; i++) {
			System.out.println(cards[i].getSuit() + " " + cards[i].getValue());
		}

		System.out.println("Top card: " + cards[0].getSuit() + " " + cards[0].getValue());
		System.out.println("Bottom card: " + cards[51].getSuit() + " " + cards[51].getValue());
	}
}