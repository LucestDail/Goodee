package Exam;

class Card{
	String kind;
	int number;
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public int hashCode() {
		return kind.hashCode() + number;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Card) {
			Card c = (Card)o;
			return kind.equals(c.kind) && number == c.number;
			
		}else {
			return false;
		}
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("s1 객체의 원래 hashCode값 : " + System.identityHashCode(c1));
		System.out.println("s2 객체의 원래 hashCode값 : " + System.identityHashCode(c2));
		if(c1.equals(c2))
			System.out.println("같은 카드임");
		if(c1 != c2)
			System.out.println("다른 객체임");
	}

}
