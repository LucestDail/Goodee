package Example;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Hong","Chun","Koo","Jun");
		list.stream().mapToInt(String::length).forEach(s -> System.out.print(s + " "));
		System.out.println();
		List<Student> list2 = Arrays.asList(
				new Student("Hong",80,95),
				new Student("Lee",90,75),
				new Student("Kim",75,70)
				);
		System.out.print("Eng score : ");
		list2.stream().mapToInt(Student::getEng).forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.print("Math score : ");
		list2.stream().mapToInt(Student::getMath).forEach(s->System.out.print(s + " "));
		System.out.println();
		
		System.out.print("Total score : ");
		list2.stream().mapToInt(s->s.getMath() + s.getEng()).forEach(s->System.out.print(s + " "));
		
		System.out.print("Name : ");
		list2.stream().map(Student::getName).forEach(s->System.out.print(s + " "));
	}

}
