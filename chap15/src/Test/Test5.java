package Test;

import java.util.*;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	SutdaCard() {
		this(1, true);
	}

	public String toString() {
		return num + ((isKwang) ? "K" : "");
	}

}

class SutdaDeck {

	final int CARD_MAX = 20;

	List<SutdaCard> cards;
	static Map<String, Integer> jokbo;
	static {
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for (int i = 1; i <= 10; i++) {
			jokbo.put("" + i + i, 3000 + (i * 10));
		}
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}

	SutdaDeck() {
		cards = new ArrayList<SutdaCard>();
		for (int i = 0; i < CARD_MAX; i++) {
			if (i == 0 || i == 2 || i == 7) {
				cards.add(new SutdaCard(i + 1, true));
			} else {
				cards.add(new SutdaCard(i % 10 + 1, false));
			}
		}

	}

	SutdaCard pick() {
		return cards.remove(0);
	}

	void shuffle() {
		Collections.shuffle(cards);
	}
}

class Gamer implements Comparable<Gamer> {
	String name;
	SutdaCard c1;
	SutdaCard c2;

	Gamer(String name, SutdaCard c1, SutdaCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}

	int getScore() {
		Integer score = 0;
		if (c1.isKwang && c2.isKwang) {
			return SutdaDeck.jokbo.get("KK");
		} else {
			score = SutdaDeck.jokbo.get("" + c1.num + c2.num);
			if (score == null) {
				score = (c1.num + c2.num) % 10;
			}
		}
		return score;
	}

	public String toString() {
		return this.name + " : " + c1 + ", " + c2 + " = " + getScore();
	}

	@Override
	public int compareTo(Gamer o) {
		return o.getScore() - getScore();
	}

}

public class Test5 {

	public static void main(String[] args) {

		int target = 0;
		System.out.println("게임을 할 인원수를 입력하세요(2 ~ 10)");
		while (true) {
			Scanner scan = new Scanner(System.in);
			target = scan.nextInt();
			if (target < 2 || target > 10) {
				System.out.println("인원수 범위를 벗어났습니다. 다시 입력하세요.");
			} else {
				break;
			}
		}

		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		List<Gamer> list = new ArrayList<>();

		for (int i = 0; i < target; i++) {
			list.add(new Gamer("player" + Integer.toString(i + 1), deck.pick(), deck.pick()));
		}

		int winnerCount = 0;
		Collections.sort(list);
		for (Gamer g : list) {
			System.out.println(++winnerCount + "등\t:\t" + g.name + "   \t("+g.c1+","+g.c2+")\t=\t"+"[" + g.getScore() + "]");
		}
	}
}
