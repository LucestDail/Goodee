package src;

class Product{
	int price;
	int point;
	Product(int price){
		this.price = price;
		this.point += price * 0.1;
	}
}

class TV extends Product{
	TV(){
		super(100);
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 500;
	int point = 0;
	Product[] items = new Product[5];
	int count = 0;
	void buy(Product p) {
		this.money -= p.price; 
		this.point += p.point;
		items[count++] = p;
		System.out.println(p + " ±∏¿‘«‘");
	}
	public String toString() {
		System.out.println("money : " + money);
		System.out.println("point : " + point);
		System.out.println("buy count : " + count);
		System.out.print("my items : ");
		String str = "";
		for(int i = 0; i < count; i++) {
			str += items[i] + " ";
		}
		return str;
		
	}
}

public class Exam3 {
	public static void main(String[] args) {
		TV myTV = new TV();
		//System.out.println(myTV);
		Computer myComputer = new Computer();
		//System.out.println(myComputer);
		Buyer Kim = new Buyer();
		Kim.buy(myTV);
		System.out.println(Kim);
		System.out.println("--------------------------------");
		Kim.buy(myComputer);
		System.out.println(Kim);
	}
}
