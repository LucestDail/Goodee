package chap10;

class Parent{
	public void method() throws RuntimeException{
		System.out.println("Parent class method() method");
	}
}

class Child extends Parent{
	public void method() throws RuntimeException{
		System.out.println("Child class method() method");
	}
}

public class ExceptionEx6 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method();
		
	}
}
