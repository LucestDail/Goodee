package chap6;

class Number1{ // 기본 생성자 제공
	int num;
}

class Number2{ // 기본 생성자 제공 안됨
	int num;
	public Number2(int x){ // < - 생성자
		num = x;
	}
}


public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		Number2 n2 = new Number2(20);
		System.out.println(n1.num);
		System.out.println(n2.num);
	}
}
