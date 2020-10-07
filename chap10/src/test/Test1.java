package test;

class Outer1 {
	class Inner1 {
		int iv = 100;
	}

	static class Inner2 {
		int iv = 200;
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println(new Outer1().new Inner1().iv);
		System.out.println(new Outer1.Inner2().iv);
	}
}