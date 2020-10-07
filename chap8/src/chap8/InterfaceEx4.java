package chap8;

interface Action{
	void action();
}

abstract class Abs{
	abstract void method();
}

public class InterfaceEx4 {

	public static void main(String[] args) {
		Action a = new Action() {
			public void action() {
				System.out.println("Action 익명 함수");
			}
		};
		a.action();
		a = new Action() {
			public void action() {
				System.out.println("Action 익명 함수2");
			}
		};
		a.action();
		
		Abs abs = new Abs() {

			@Override
			void method() {
				System.out.println("Abs method 익명 함수");
				
			}
			
		};
		abs.method();
		a = () -> System.out.println("Action 인터페이스 객체 람다 생성");
		a.action();
	}

}
