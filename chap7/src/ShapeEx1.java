package src;

/*
 *  추상 클래스 예제
 *  추상클래스란
 *  	1. 추상메서드를 가질 수 있는 클래스, abstract 예약어를 이용하여 구현함
 *  	2. 객체화 불가능 =>상속을 통해서 자손 클래스 객체화를 통해서 객체화 가능
 *  	3. 그 이외에는 일반 클래스와 동일(생성자, 맴버변수, 맴버메서드, 초기화블럭, 상속 등)
 *  	4. 기능을 표준화하여 사용이 기능
 *  
 *  추상 메소드 : 메소드의 선언부만 존재하는 메소드, 구현부가 없습니다.
 *  	=> 자손클래스에서 반드시 오버라이딩 해야만 합니다.
 * 
 * 
 */

abstract class Shape {
	String type;

	Shape(String type) {
		this.type = type;
	}

	abstract double area();

	abstract double length();
}

class Circle extends Shape {

	int r;

	Circle(int r) {
		super("Circle");
		this.r = r;
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	double length() {
		return r * 2 * Math.PI;
	}

	public String toString() {
		return "your value : " + r +", your circle area : " + area() + ", length : " + length();
	}

}

class Rectangle extends Shape {
	int width;
	int height;

	Rectangle(int width, int height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return 2 * (width + height);
	}

	public String toString() {
		return "your value : " + width +", " + height + ", your rectangle area : " + area() + ", length : " + length();
	}
}

public class ShapeEx1 {

	public static void main(String[] args) {
		final int ARR_MAX = 10;
		Shape[] arr = new Shape[ARR_MAX];
		Rectangle myRectangle = new Rectangle(4, 5);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Circle(i);
			System.out.println(arr[i]);
		}
		System.out.println(myRectangle);
	}

}
