package Exam;

import java.util.Arrays;
import java.util.*;

class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int gender;
	private int age;

	public Member(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
}

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("Hong", Member.MALE, 30), new Member("Jang", Member.FEMALE, 20),
				new Member("Lee", Member.MALE, 45), new Member("Sung", Member.FEMALE, 27));
		System.out.print("male age average : ");
		System.out.print(list.stream().filter(a -> a.getGender() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble());
		System.out.println();
		System.out.print("female age average : ");
		System.out.print(list.stream().filter(a -> a.getGender() == Member.FEMALE).mapToInt(Member::getAge).average().getAsDouble());
		System.out.println();
		System.out.print("male name list : ");
		list.stream().filter(a -> a.getGender() == Member.MALE).map(Member::getName).forEach(s->System.out.print(s + " "));
		System.out.println();
		System.out.print("female name list : ");
		list.stream().filter(a -> a.getGender() == Member.FEMALE).map(Member::getName).forEach(s->System.out.print(s + " "));
		System.out.println();
	}

}
