package chap6;

class Animal2 {
	String name;
	int age;

	Animal2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Animal2(String name) {
		this(name,1);
	}

	Animal2(int age) {
		this("���",age);
	}
	void info() {
		System.out.println(this.name + " : " + this.age + "��");
	}

}
public class Test01{
	public static void main(String[] ags) {
		Animal2 a1 = new Animal2("������", 26);
		Animal2 a2 = new Animal2("����");
		Animal2 a3 = new Animal2(100);
		a1.info();
		a2.info();
		a3.info();
	}
}