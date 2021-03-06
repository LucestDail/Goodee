package chap8;

/*
 * jdk8 이후 인터페이스도 구현부를 가진 메소드를 맴버로 가질 수 있습니다.
 * 	default : 인스턴스 맴버
 * 	static : 클래스 맴버
 */

interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1 default method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface1 static method1");
	}
}

interface MyInterface2{
	void method();
	default void method1() {
		System.out.println("MyInterface2 default method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface2 static method1");
	}
}

class Parent{
	public void method2() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2{

	@Override
	public void method1() {
		System.out.println("Child class method1");
	}
	
	@Override
	public void method() {
		System.out.println("Child class method");
	}
}

public class InterfaceEx5 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method(); // Child 클래스가 구현클래스로서 구현.
		
		c.method1(); //interface 디폴트 
		c.method2(); //상속받아서 그대로 사용(Parent class 의 method2 임)
		
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}
