package Exam;

class MyException1 extends RuntimeException{
	MyException1(String msg){
		super(msg);
	}
}

public class Exan2 {

	public static void main(String[] args) {
		method();
	}
	private static void method()  {
		throw new MyException1("exam2.method() 예외강제발생");
	}

}
