package Test;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class Test2 {
	static Person[] arr = {
			new Person("ȫ�浿", 10),
			new Person("���", 30),
			new Person("�̸���", 15),
			new Person("���ڹ�", 25),
			new Person("���ڹ�", 20)
			};

	public static void main(String[] args) {
		System.out.print("�̸� ��� :");
		printString(t -> t.getName());
		System.out.print("���� ��� :");
		printInt(t -> t.getAge());
		System.out.print("�ѳ����� �ջ� :");
		printTot(t -> t.getAge());
		System.out.print("������ ��� :");
		printAvg(t -> t.getAge());
	}

	static void printString(Function<Person, String> f) {
		for(Person p : arr) {
			System.out.print(f.apply(p) + ", ");
		}
		System.out.println();
	}

	static void printInt(ToIntFunction<Person> f) {
		for(Person p : arr) {
			System.out.print(f.applyAsInt(p) + ", ");
		}
		System.out.println();
	}

	static void printTot(ToIntFunction<Person> f) {
		int sum = 0;
		for(Person p : arr) {
			sum += f.applyAsInt(p);
		}
		System.out.println(sum);
	}

	static void printAvg(ToDoubleFunction<Person> f) {
		double sum = 0;
		for(Person p : arr) {
			sum += f.applyAsDouble(p);
		}
		System.out.println(sum / arr.length);
	}
}