package Exam;

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
			jokbo.put(""+i+i, 3000+(i*10));
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

class Gamer implements Comparable<Gamer>{
	String name;
	SutdaCard c1;
	SutdaCard c2;
	Gamer(String name, SutdaCard c1, SutdaCard c2){
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	int getScore() {
		Integer score = 0;
		if(c1.isKwang && c2.isKwang) {
			return SutdaDeck.jokbo.get("KK");
		}else {
			score = SutdaDeck.jokbo.get(""+c1.num + c2.num);
			if(score == null) {
				score = (c1.num + c2.num)% 10; 
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

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubdk
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		List<Gamer> list = new ArrayList<>();
		list.add(new Gamer("È«±æµ¿",deck.pick(),deck.pick()));
		list.add(new Gamer("±è»ñ°«",deck.pick(),deck.pick()));
		list.add(new Gamer("ÀÌ¸ù·æ",deck.pick(),deck.pick()));
		list.add(new Gamer("¼ºÃáÇâ",deck.pick(),deck.pick()));
		int score = 0;
		String winer = "";
		int winnerCount = 0;
		Collections.sort(list); //Å¬·¡½º
		for(Gamer g : list) {
			System.out.println(g);
			if(g.getScore() > score) {
				score = g.getScore();
				winer = g.name;
				winnerCount = 0;
			}else if(g.getScore() == score) {
				winnerCount++;
			}
		}
		System.out.println("³²Àº Ä«µå °¹¼ö : " + deck.cards.size());
		if(winnerCount > 0) {
			System.out.println("ºñ±è");
		}else {
			System.out.println(winer + " ½Â¸®");
		}
		
	}

}
