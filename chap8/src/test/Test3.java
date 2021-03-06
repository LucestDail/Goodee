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
		super("강아지", 4);
	}

	@Override
	void sound() {
		System.out.println("멍멍짖는다");
		
	}

	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}
	public String toString() {
		return "강아지";
	}
	
}

class Lion extends Animal{

	Lion() {
		super("사자", 4);
	}

	@Override
	void sound() {
		System.out.println("어흥거린다");
		
	}

	@Override
	void eat() {
		System.out.println("초식 동물을 잡아 먹는다");
	}
	
	public String toString() {
		return "사자";
	}
	
	
}

class Eagle extends Animal implements Flyable{
	
	Eagle() {
		super("독수리", 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(type + "는 날아다닌다");
	}

	@Override
	void sound() {
		System.out.println("모른다");
	}

	@Override
	void eat() {
		System.out.println("동물을 잡아 먹는다");
		
	}
	public String toString() {
		return "독수리";
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Lion();
		animal[2] = new Eagle();
		for (Animal a : animal) {
			System.out.print(a.type + ",다리수:" + a.leg + "개 =>");
			a.sound();
			a.eat();
			if (a instanceof Flyable) {
				((Flyable) a).fly();
			}
		}
	}
}