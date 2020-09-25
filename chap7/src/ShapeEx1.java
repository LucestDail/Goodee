package src;

/*
 *  �߻� Ŭ���� ����
 *  �߻�Ŭ������
 *  	1. �߻�޼��带 ���� �� �ִ� Ŭ����, abstract ���� �̿��Ͽ� ������
 *  	2. ��üȭ �Ұ��� =>����� ���ؼ� �ڼ� Ŭ���� ��üȭ�� ���ؼ� ��üȭ ����
 *  	3. �� �̿ܿ��� �Ϲ� Ŭ������ ����(������, �ɹ�����, �ɹ��޼���, �ʱ�ȭ��, ��� ��)
 *  	4. ����� ǥ��ȭ�Ͽ� ����� ���
 *  
 *  �߻� �޼ҵ� : �޼ҵ��� ����θ� �����ϴ� �޼ҵ�, �����ΰ� �����ϴ�.
 *  	=> �ڼ�Ŭ�������� �ݵ�� �������̵� �ؾ߸� �մϴ�.
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
