public class Card {
	private String suit;
	private int value;

	public Card (String s, int v) {
		suit = s;
		value = v;
	}

	public String getSuit () {
		return suit;
	}

	public int getValue () {
		return value;
	}

	public void setSuit (String s) {
		if (s.toUpperCase().equals("SPADE") || s.toUpperCase().equals("HEART") || s.toUpperCase().equals("CLUBS") ||s.toUpperCase().equals("DIAMOND")) {
			suit = s;
		}
		else {
			suit = null;
		}
	}

	public void setValue (int v) {
		if (v > 0 && v < 14) {
			value = v;
		}
		else {
			value = 0;
		}
	}
}