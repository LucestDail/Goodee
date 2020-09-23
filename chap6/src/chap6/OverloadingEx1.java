package chap6;

/*
 * 오버로딩 예제(객체지향 프로그래밍의 특징 - 다형성에 기반)
 * 		1. 클래스 내부에 같은 이름의 메서드가 여러개 존재할 수 있다.
 * 		2. 매개변수 목록이 달라야 한다.(재료형, 갯수, 순서)
 * 
 * 
 */

class Math2{
	int a = 100;
	int add(int b) {
		System.out.println("int add  : ");
		return a+b;
	}
	double add(double b) {
		System.out.println("double add : ");
		return a+b;
	}
	String add(String b) {
		System.out.println("String add : ");
		return a+b;
	}
}

public class OverloadingEx1 {
	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
	}
}
