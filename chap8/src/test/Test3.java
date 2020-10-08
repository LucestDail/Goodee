package test;

abstract class Animal{
	public String type;
	public int leg;
	
	Animal(String type, int leg){
		this.type = type;
		this.leg = leg;
	}
	
	abstract void sound();
	abstract void eat();
	
}


interface Flyable{
	void fly();
}

class Dog extends Animal{
	Dog() {
		super("������", 4);
	}

	@Override
	void sound() {
		System.out.println("�۸�¢�´�");
		
	}

	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�");
	}
	public String toString() {
		return "������";
	}
	
}

class Lion extends Animal{

	Lion() {
		super("����", 4);
	}

	@Override
	void sound() {
		System.out.println("����Ÿ���");
		
	}

	@Override
	void eat() {
		System.out.println("�ʽ� ������ ��� �Դ´�");
	}
	
	public String toString() {
		return "����";
	}
	
	
}

class Eagle extends Animal implements Flyable{
	
	Eagle() {
		super("������", 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(type + "�� ���ƴٴѴ�");
	}

	@Override
	void sound() {
		System.out.println("�𸥴�");
	}

	@Override
	void eat() {
		System.out.println("������ ��� �Դ´�");
		
	}
	public String toString() {
		return "������";
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Lion();
		animal[2] = new Eagle();
		for (Animal a : animal) {
			System.out.print(a.type + ",�ٸ���:" + a.leg + "�� =>");
			a.sound();
			a.eat();
			if (a instanceof Flyable) {
				((Flyable) a).fly();
			}
		}
	}
}