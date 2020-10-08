package Test;

/*
2. ������ ����� �������� Card Ŭ������ �����ϱ�
[���]
c1�� c2�� �ٸ� ��ü�Դϴ�.
c1�� c2�� ���� ������ ī�� �Դϴ�.
c1 ī�� :(Spade,1)
c2 ī�� :(Spade,1)
 */

class Card{
	String kind;
	int number;
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public Card() {
		kind = "Spade";
		number = 1;
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
	public String toString() {
		return "("+this.kind+"," +this.number +")";
	}
}

public class Test2 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card();
		if (c1 == c2) {
			System.out.println("c1�� c2�� ���� ��ü�Դϴ�.");
		} else {
			System.out.println("c1�� c2�� �ٸ� ��ü�Դϴ�.");
		}
		if (c1.equals(c2)) {
			System.out.println("c1�� c2�� ���� ������ ī�� �Դϴ�.");
		} else {
			System.out.println("c1�� c2�� �ٸ� ������ ī�� �Դϴ�.");
		}
		System.out.println("c1 ī�� :" + c1);
		System.out.println("c2 ī�� :" + c2);
	}
}