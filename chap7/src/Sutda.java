package src;

class SutdaDeck {
	final int CARD_MAX = 20;
	SutdaCard[] cards = new SutdaCard[CARD_MAX];

	SutdaDeck() {
		for (int i = 0; i < CARD_MAX; i++) {
			if (i == 0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard(i + 1, true);
			} else {
				cards[i] = new SutdaCard(i % 10 + 1, false);
			}
		}
	}

	void shuffle() {
		int idx = 0;
		SutdaCard tmp;
		for (int i = 0; i < CARD_MAX; i++) {
			idx = (int) (Math.random()*CARD_MAX);
			tmp = cards[idx];
			cards[idx] = cards[i];
			cards[i] = tmp;
		}
	}

	public SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_MAX)
			return null;
		return cards[index];
	}

	SutdaCard pick() {
		int idx =(int) (Math.random() * CARD_MAX);
		return cards[idx];
	}
	public String toString() {
		String result = "";
		for(SutdaCard item : cards) {
			result += item + ",";
		}
		return result;
	}

}

class SutdaCard {
	int number;
	boolean isKwang;

	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}

	SutdaCard() {
		this(1, true);
	}

	@Override
	public String toString() {
		return number + ((isKwang) ? "K" : "");
	}
}

public class Sutda {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();//
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println("첫번째 카드 : " + deck.pick(0));
		System.out.println("랜덤 선택 카드 : " + deck.pick());
	}
}
