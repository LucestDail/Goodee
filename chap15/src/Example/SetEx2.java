package Example;

/**
 * 객체의 중복 여부 판단
 * 1. equals : 결과 true
 * 2. hashCode : 결과값이 같은 경우
 * => 1,2 모두 만족할 경우에만 중복된 객체로 판단
 * 
 * equals 메소드 오버라이딩 하게되면 hashCode() 역시 오버라이딩 하도록 권장
 * 
 */

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "(" + name + "," + age + ")";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && age == p.age;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 10));
		System.out.println(set);
	}

}
