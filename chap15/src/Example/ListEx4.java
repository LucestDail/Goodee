package Example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Circle 클래스 구현
 * Shape 클래스의 하위 클래스
 * 맴버 : double 반지름(r)
 * 생성자 : 반지름 입력받아 객체 생성, 없는 경우 1로 객체 생성
 * 넓이, 둘레 구하는 메소드 구현
 * 
 * Rectangle 클래스 구현
 * Shape 클래스의 하위 클래스
 * 맴버 : int 가로(w), 세로(h)
 * 생성자 : 가로, 세로 값을 입력받아 객체 생성, 없는 경우 1,1로 객체 생성
 * 넓이, 둘레 구하는 메소드 구현
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
		return super.toString() + "반지름 : " + r + ", 면적 : " + area() + ", 둘레 : " + length();
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
		return super.toString() + "가로 : " + w + ", 세로 : " + h + ", 면적 : " + area() + ", 둘레 : " + length();
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
