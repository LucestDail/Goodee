package chap6;

class Car{
	String color;
	int number;
	static int width = 200;
	static int height = 120;
	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}


public class CarEx1 {

	public static void main(String[] args) {
		System.out.println("자동차의 크기 : " + Car.width + "," + Car.height);
		Car car1 = new Car();
		car1.color = "White";
		car1.number = 1234;
		System.out.println(car1.toString());
		System.out.println("car1 : " + car1);
		
		Car car2 = new Car();
		car2.color = "Black";
		car2.number = 5678;
		System.out.println(car2.toString());
		System.out.println("car2 : " + car2);
		
		car1.width = 300;
		car1.height = 200;
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
	}

}
