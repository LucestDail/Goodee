package Example;

import java.util.*;

class Student2 implements Comparable<Student2>{
	private String studno;
	private String name;
	private int grade;
	Student2(String studno, String name, int grade){
		this.studno = studno;
		this.name = name;
		this.grade = grade;
	}
	public String toString() {
		return String.format("[studno:%s][name:%s][grade:%d]", studno,name,grade);
	}
	public String getStudno() {
		return studno;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	@Override
	public int compareTo(Student2 s) {
		// TODO Auto-generated method stub
		return studno.compareTo(s.studno);
	}
}

public class SortedEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> list = Arrays.asList(
				new Student2("1000","HongGD",1),
				new Student2("1234","KimSK",2),
				new Student2("3456","LeeMR",3),
				new Student2("1001","LimKG",4)
				);
		//type name = new type();
		System.out.println("======studno sorting(asc)======");
		list.stream().sorted().forEach(System.out::println);
		//in other way to desc sorting
		System.out.println("======studno sorting comparable reversing(desc)======");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("======studno sorting with comparator(desc)======");
		list.stream().sorted(new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return s2.getStudno().compareTo(s1.getStudno());
			}
		}).forEach(System.out::println);
		System.out.println("======name sorting with comparator======");
		list.stream().sorted(new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
				// TODO Auto-generated method stub
				return s1.getName().compareTo(s2.getName());
			}
		}).forEach(System.out::println);
		System.out.println("======name sorting with Lambda======");
		list.stream().sorted((s1,s2) -> s1.getName().compareTo(s2.getName())).forEach(System.out::println);
		System.out.println("======grade sorting with comparator(desc)======");
		list.stream().sorted(new Comparator<Student2>() {

			@Override
			public int compare(Student2 s1, Student2 s2) {
				// TODO Auto-generated method stub
				return s2.getGrade() - s1.getGrade();
			}
			
		}).forEach(System.out::println);
		//or...
		Comparator<Student2> c = new Comparator<Student2>() {

			@Override
			public int compare(Student2 s1, Student2 s2) {
				// TODO Auto-generated method stub
				return s2.getGrade() - s1.getGrade();
			}
		};
		list.stream().sorted(c).forEach(System.out::println);
		System.out.println("======grade sorting with lambda(desc)======");
		list.stream().sorted((s1,s2) -> s2.getGrade() - s1.getGrade()).forEach(System.out::println);
		

	}

}
