package chap6;

class Math1{
	int add1(int a, int b) {
		return a+b;
	}
	int add2(int a, int b) {
		return a+b;
	}
	void add3(int a, int b) {
		System.out.println(a+b);
	}
}

public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10, 20);
		long a2 = m1.add2(10,20);
		System.out.println(a1 + ","+a2);
	}

}
