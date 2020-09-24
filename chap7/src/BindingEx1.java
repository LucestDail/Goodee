package src;

class Grand3{
	int x = 100;
	void method() {
		System.out.println("grand method");
	}
}


class Parent3 extends Grand3{
	int x = 10;
	void method() {
		System.out.println("parent3 method");
	}
}

class Child3 extends Parent3{
	int x = 20;
	void method() {
		System.out.println("Child3 method");
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x);
	}
}

public class BindingEx1 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = (Child3)p;
		System.out.println(p.x); // 10
		System.out.println(c.x); // 20
		/*
		 * ¸É¹öº¯¼öÀÇ °ªÀº ÂüÁ¶º¯¼ö¸¦ ÂÑ¾Æ°©´Ï´Ù.
		 * ¸Þ¼­µå´Â °´Ã¼¸¦ ÂÑ¾Æ°©´Ï´Ù.
		 */
		p.method(); // Child3 method
		c.method(); // Child3 method

	}

}
