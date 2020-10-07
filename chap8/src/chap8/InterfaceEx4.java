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
				System.out.println("Action �͸� �Լ�");
			}
		};
		a.action();
		a = new Action() {
			public void action() {
				System.out.println("Action �͸� �Լ�2");
			}
		};
		a.action();
		
		Abs abs = new Abs() {

			@Override
			void method() {
				System.out.println("Abs method �͸� �Լ�");
				
			}
			
		};
		abs.method();
		a = () -> System.out.println("Action �������̽� ��ü ���� ����");
		a.action();
	}

}
