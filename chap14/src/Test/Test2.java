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
			new Person("È«±æµ¿", 10),
			new Person("±è»ñ°«", 30),
			new Person("ÀÌ¸ù·æ", 15),
			new Person("±èÀÚ¹Ù", 25),
			new Person("¹ÚÀÚ¹Ù", 20)
			};

	public static void main(String[] args) {
		System.out.print("ÀÌ¸§ ¸ñ·Ï :");
		printString(t -> t.getName());
		System.out.print("³ªÀÌ ¸ñ·Ï :");
		printInt(t -> t.getAge());
		System.out.print("ÃÑ³ªÀÌÀÇ ÇÕ»ê :");
		printTot(t -> t.getAge());
		System.out.print("³ªÀÌÀÇ Æò±Õ :");
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