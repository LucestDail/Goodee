package src;

class Food {
	int price;
	int point;
}

class Fruit extends Food {
	double brix;
}

class Apple extends Fruit {

	public Apple(int price, double brix) {
		this.price = price;
		this.point = price/10;
		this.brix = brix;
	}
	public String toString() {
		return "사과";
	}

}

class Peach extends Fruit {

	public Peach(int price, double brix) {
		this.price = price;
		this.point = price/10;
		this.brix = brix;
	}
	public String toString() {
		return "복숭아";
	}

}

class Drink extends Food {
	int ml;
}

class Cock extends Drink {

	public Cock(int price, int ml) {
		this.price = price;
		this.point = price/10;
		this.ml = ml;
	}
	public String toString() {
		return "콜라";
	}

}

class Sidar extends Drink {
	public Sidar(int price, int ml) {
		this.price = price;
		this.point = price/10;
		this.ml = ml;
	}
	public String toString() {
		return "사이다";
	}
}

class Snack extends Food {
	int gram;
}

class Biscuit extends Snack {

	public Biscuit(int price, int gram) {
		this.price = price;
		this.point = price/10;
		this.gram = gram;
	}
	public String toString() {
		return "비스킷";
	}

}

class Cookie extends Snack {

	public Cookie(int price, int gram) {
		this.price = price;
		this.point = price/10;
		this.gram = gram;
	}
	public String toString() {
		return "쿠키";
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
			}else if(f instanceof Drink) {
				drinkCart[drinkCount++] = f;
				this.drinkPriceSum += f.price;
			}else if(f instanceof Snack) {
				snackCart[snackCount++] = f;
				this.snackPriceSum += f.price;
			}
			System.out.println(f + "를(을) "+f.price +"가격에 구입");
		}else {
			System.out.println(f + "구입시 잔액 부족");
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
		System.out.print("식품 구매 목록 : " + foodSum + ", ");
		String str = "";
		for (int i = 0; i < count; i++) {
			str += cart[i] + " ";
		}
		System.out.println(str);
		
		System.out.print("과일 구매 목록 : " + fruitPriceSum + ", ");
		str = "";
		for (int i = 0; i < fruitCount; i++) {
			str += fruitCart[i] + " ";
		}
		System.out.println(str);
		
		System.out.print("음료 구매 목록 : " + drinkPriceSum + ", ");
		str = "";
		for (int i = 0; i < drinkCount; i++) {
			str += drinkCart[i] + " ";
		}
		System.out.println(str);
		
		System.out.print("과자 구매 목록 : " + snackPriceSum + ", ");
		str = "";
		for (int i = 0; i < snackCount; i++) {
			str += snackCart[i] + " ";
		}
		System.out.println(str);
		
	}
}

public class Homework1 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);// 가격, 당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000, 13.5);// 가격, 당도(brix)
		Cock cock = new Cock(500, 500); // 가격, 용량(ml)
		Sidar sidar = new Sidar(1500, 1000);// 가격, 용량(ml)
		Biscuit bis = new Biscuit(10000, 500);// 가격, 무게(gram)
		Cookie cookie = new Cookie(500, 5000);// 가격, 무게(gram)
		Buyer2 b = new Buyer2();
		b.buy(apple);
		b.buy(peach);
		b.buy(cock);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		System.out.println("고객 잔액:" + b.money);
		System.out.println("고객 포인트:" + b.point);
		b.summary();
	}

}
