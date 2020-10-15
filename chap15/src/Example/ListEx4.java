package Example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Circle Ŭ���� ����
 * Shape Ŭ������ ���� Ŭ����
 * �ɹ� : double ������(r)
 * ������ : ������ �Է¹޾� ��ü ����, ���� ��� 1�� ��ü ����
 * ����, �ѷ� ���ϴ� �޼ҵ� ����
 * 
 * Rectangle Ŭ���� ����
 * Shape Ŭ������ ���� Ŭ����
 * �ɹ� : int ����(w), ����(h)
 * ������ : ����, ���� ���� �Է¹޾� ��ü ����, ���� ��� 1,1�� ��ü ����
 * ����, �ѷ� ���ϴ� �޼ҵ� ����
 * 
 * 
 * */
abstract class Shape implements Comparable<Shape> {
	int x, y;

	Shape() {
		this(0, 0);
	}

	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract double area();

	abstract double length();

	public String toString() {
		return "x : " + x + ", y : " + y;
	}
}

class Circle extends Shape {
	double r;

	Circle() {
		this(1);
	}

	Circle(double r) {
		this.r = r;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return this.r * this.r * Math.PI;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return this.r * Math.PI * 2;
	}

	public String toString() {
		return super.toString() + "������ : " + r + ", ���� : " + area() + ", �ѷ� : " + length();
	}

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return (int) (area() - o.area());
	}
}

class Rectangle extends Shape {
	int w;
	int h;

	Rectangle() {
		this(1, 1);
	}

	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return this.w * this.h;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return (this.w + this.h) * 2;
	}

	public String toString() {
		return super.toString() + "���� : " + w + ", ���� : " + h + ", ���� : " + area() + ", �ѷ� : " + length();
	}

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return (int) (area() - o.area());
	}
}

public class ListEx4 {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Circle(5));
		list.add(new Rectangle(3, 4));
		list.add(new Circle());
		list.add(new Circle(10));
		list.add(new Rectangle());
		for (Shape s : list) {
			System.out.println(s);
		}
		System.out.println("Sorting..................................");
		Collections.sort(list,Comparator.reverseOrder());
		for (Shape s : list) {
			System.out.println(s);
		}
		System.out.println("Sorting..................................");
		Collections.sort(list,new Comparator<Shape>() {
			public int compare(Shape s1, Shape s2) {
				return (int) (s1.length() - s2.length());
			}
		});
		for (Shape s : list) {
			System.out.println(s);
		}
		System.out.println("Sorting..................................");
		Collections.sort(list,
				(s1,s2)->(int)(s2.length() - s1.length()));
		for (Shape s : list) {
			System.out.println(s);
		}
	}

}
