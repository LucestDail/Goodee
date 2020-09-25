package src;

class Food {
	int price;
	int point;
	Food(int price){
		this.price = price;
		this.point = price/10;
	}
}

class Fruit extends Food {
	double brix;
	Fruit(int price, double brix){
		super(price);
		this.brix = brix;
	}
}

class Apple extends Fruit {

	Apple(int price, double brix){
		super(price, brix);
	}
	public String toString() {
		return "���";
	}

}

class Peach extends Fruit {

	Peach(int price, double brix){
		super(price, brix);
	}
	public String toString() {
		return "������";
	}

}

class Drink extends Food {
	int ml;
	Drink(int price, int ml){
		super(price);
		this.ml = ml;
	}
}

class Cock extends Drink {

	Cock(int price, int ml){
		super(price, ml);
	}
	public String toString() {
		return "�ݶ�";
	}

}

class Sidar extends Drink {
	Sidar(int price, int ml){
		super(price, ml);
	}
	public String toString() {
		return "���̴�";
	}
}

class Snack extends Food {
	int gram;
	Snack(int price, int gram){
		super(price);
		this.gram = gram;
	}
}

class Biscuit extends Snack {

	Biscuit(int price, int gram){
		super(price, gram);
	}
	public String toString() {
		return "��Ŷ";
	}

}

class Cookie extends Snack {

	Cookie(int price, int gram){
		super(price, gram);
	}
	public String toString() {
		return "��Ű";
	}

}

class Buyer2 {
	final int COUNT_MAX = 10;
	int money = 10000;
//	int money = 5000;
	int point = 0;
	Food[] cart = new Food[COUNT_MAX];
	Food[] fruitCart = new Food[COUNT_MAX];
	Food[] drinkCart = new Food[COUNT_MAX];
	Food[] snackCart = new Food[COUNT_MAX];
	int count = 0;
	int fruitCount = 0;
	int drinkCount = 0;
	int snackCount = 0;
	int foodSum = 0;
	int fruitPriceSum = 0;
	int drinkPriceSum = 0;
	int snackPriceSum = 0;
	void buy(Food f) {
		if(money > f.price) {
			this.money -= f.price;
			this.point += f.point;
			cart[count++] = f;
			this.foodSum += f.price;
			if(f instanceof Fruit) {
				fruitCart[fruitCount++] = f;
				this.fruitPriceSum += f.price;
				System.out.println("�絵 : " + ((Fruit) f).brix);
			}else if(f instanceof Drink) {
				drinkCart[drinkCount++] = f;
				System.out.println("�뷮 : " + ((Drink) f).ml);
				this.drinkPriceSum += f.price;
			}else if(f instanceof Snack) {
				snackCart[snackCount++] = f;
				this.snackPriceSum += f.price;
				System.out.println("�߷� : " + ((Snack) f).gram);
			}
			System.out.println(f + "��(��) "+f.price +"���ݿ� ����");
		}else {
			System.out.println(f + "���Խ� �ܾ� ����");
		}
	}

	public String toString() {
		System.out.println("money : " + money);
		System.out.println("point : " + point);
		System.out.println("buy count : " + count);
		System.out.print("my items : ");
		String str = "";
		for (int i = 0; i < count; i++) {
			str += cart[i] + " ";
		}
		return str;
	}

	public void summary() {
		System.out.print("��ǰ ���� ��� : " + foodSum + ", ");
		String str = "";
		for (int i = 0; i < count; i++) {
			str += cart[i] + " ";
		}
		System.out.println(str);
		
		System.out.print("���� ���� ��� : " + fruitPriceSum + ", ");
		str = "";
		for (int i = 0; i < fruitCount; i++) {
			str += fruitCart[i] + " ";
		}
		System.out.println(str);
		
		System.out.print("���� ���� ��� : " + drinkPriceSum + ", ");
		str = "";
		for (int i = 0; i < drinkCount; i++) {
			str += drinkCart[i] + " ";
		}
		System.out.println(str);
		
		System.out.print("���� ���� ��� : " + snackPriceSum + ", ");
		str = "";
		for (int i = 0; i < snackCount; i++) {
			str += snackCart[i] + " ";
		}
		System.out.println(str);
		
	}
}

public class Homework1 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);// ����, �絵(brix)
		System.out.println("��� ����:" + apple.price);
		System.out.println("��� �絵:" + apple.brix);
		Peach peach = new Peach(1000, 13.5);// ����, �絵(brix)
		Cock cock = new Cock(500, 500); // ����, �뷮(ml)
		Sidar sidar = new Sidar(1500, 1000);// ����, �뷮(ml)
		Biscuit bis = new Biscuit(10000, 500);// ����, ����(gram)
		Cookie cookie = new Cookie(500, 5000);// ����, ����(gram)
		Buyer2 b = new Buyer2();
		b.buy(apple);
		b.buy(peach);
		b.buy(cock);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		System.out.println("�� �ܾ�:" + b.money);
		System.out.println("�� ����Ʈ:" + b.point);
		b.summary();
	}

}
