package src;

public class FinalClass {
	public void method() {
		System.out.println("FinalClass method");
	}
}
class SubClass extends FinalClass{
	public void method() {
		System.out.println("SubClass method");
	}
}