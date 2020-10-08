package chap8;

/*
 * jdk8 ���� �������̽��� �����θ� ���� �޼ҵ带 �ɹ��� ���� �� �ֽ��ϴ�.
 * 	default : �ν��Ͻ� �ɹ�
 * 	static : Ŭ���� �ɹ�
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
		c.method(); // Child Ŭ������ ����Ŭ�����μ� ����.
		
		c.method1(); //interface ����Ʈ 
		c.method2(); //��ӹ޾Ƽ� �״�� ���(Parent class �� method2 ��)
		
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}