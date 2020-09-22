package chap6;
/*
 * 1. Card Ŭ������ ������ ������ ������ ����� �������� ���� Ŭ������ �ϼ��Ͻÿ�
 * class Card {
 * String kind;
 * int number;
 * static int width = 100;
 * static int height = 250;
 * public String toString() {
 * return kind + ":" + number + "(" + width + "," + height +")";}}
 * [���]
 * Heart:1(100,250)
 * Spade:1(100,250)
 * Heart:1(50,80)
 * Spade:1(50,80)
 */
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height +")";
		}
	}

public class Homework1 {

	public static void main(String[] args) {
		Card[] CardArray = new Card[4];
		Card c1 = new Card();
		for(int i = 0; i < CardArray.length;i++) {
			CardArray[i] = new Card();
			switch(i) {
			case 0:
				CardArray[i].kind = "Heart";
				CardArray[i].number = 1;
				System.out.println(CardArray[i]);
				break;
			case 1:
				CardArray[i].kind = "Spade";
				CardArray[i].number = 1;
				System.out.println(CardArray[i]);
				break;
			case 2:
				CardArray[i].kind = "Heart";
				Card.width = 50;
				Card.height = 80;
				CardArray[i].number = 1;
				System.out.println(CardArray[i]);
				break;
			case 3:
				CardArray[i].kind = "Spade";
				CardArray[i].number = 1;
				System.out.println(CardArray[i]);
				break;
			}
		}
	}
}
