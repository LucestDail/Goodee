package src;

class Parent {
	int x;

	Parent(int x) {
		this.x = x;
		System.out.println("parent activated");
	}
}

class Child extends Parent {
//	int x = 20;

	Child() {
		super(50);
		System.out.println("child activated");
	}

	void method() {
		int x = 30;
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}
