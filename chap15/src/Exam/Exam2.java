package Exam;

import java.util.HashSet;
import java.util.Set;

class Student {
	String studno;
	String name;
	String major;

	Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return studno.equals(s.studno) && name.equals(s.name);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return studno.hashCode() + name.hashCode();
	}

	public String toString() {
		return "학번=" + this.studno + ", 이름=" + this.name + ", 전공=" + this.major;
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("1234", "홍길동", "경영"));
		set.add(new Student("2345", "홍길순", "경영"));
		set.add(new Student("2345", "홍길순", "컴공"));
		set.add(new Student("1234", "홍길동", "통계"));
		set.add(new Student("4567", "홍길순", "경영"));
		System.out.println("등록 학생 수 : " + set.size());
		System.out.println("----------등록학생----------");
		for (Student s : set) {
			System.out.println(s);
		}
	}
}
