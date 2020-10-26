package Test;

import java.util.*;
class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name + ":" + this.age;
	}
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return name.compareTo(p.name);
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		Person[] arr = {
				new Person("È«±æµ¿", 10),
				new Person("±è»ñ°«", 30),
				new Person("ÀÌ¸ù·æ", 15),
				new Person("±èÀÚ¹Ù", 25),
				new Person("¹ÚÀÚ¹Ù", 20)
				};
		TreeSet<Person> s1 = new TreeSet<Person>();
		for (Person p : arr)
			s1.add(p);
		System.out.print("ÀÌ¸§¼ø:");
		System.out.println(s1);
		TreeSet<Person> s2 = new TreeSet<Person>((p1,p2)->(p1.age - p2.age));
		for (Person p : arr)
			s2.add(p);
		System.out.print("³ªÀÌ¼ø:");
		System.out.println(s2);
		TreeSet<Person> s3 = new TreeSet<Person>(Comparator.reverseOrder());
		for (Person p : arr)
			s3.add(p);
		System.out.print("ÀÌ¸§ ¿ª¼ø:");
		System.out.println(s3);
		TreeSet<Person> s4 = new TreeSet<Person>((p1,p2)->(p2.age - p1.age));
		for (Person p : arr)
			s4.add(p);
		System.out.print("³ªÀÌ ¿ª¼ø:");
		System.out.println(s4);

	}

}