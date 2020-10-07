package chap8;

abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();
}

interface Flyable{
	void fly();
}

class Dove extends Animal implements Flyable{

	Dove() {
		super("��ѱ�");	
	}

	@Override
	public void fly() {
		System.out.println("��ѱ�� ���ƴٴѴ�.");
		
	}

	@Override
	void eat() {
		System.out.println("��ѱ�� ���� ������ ��ƸԴ´�.");
	}
	
	public String toString() {
		return "��ѱ�";
	}
}

class Monkey extends Animal{

	Monkey() {
		super("������");
	}

	@Override
	void eat() {
		System.out.println("�����̴� �������� ���Ÿ� ���Դ´�.");
		
	}
	
	public String toString() {
		return "������";
	}
	
}

public class Exam1 {

	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			((Flyable) a).fly();
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			((Flyable) a).fly();
		}else {
			System.out.println("�����̴� ���ƴٴ��� ���Ѵ�");
		}
		

	}

}
